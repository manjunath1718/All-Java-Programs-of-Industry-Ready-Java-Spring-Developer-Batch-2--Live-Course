package com.telusko.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

import com.telusko.model.Customer;
import com.telusko.repo.ICustomerRepo;

@Configuration
public class SpringBatchConfig {
	
	@Autowired
	private ICustomerRepo repo;
	
	@Autowired
	private JobRepository jobRepo;

	@Autowired
	private PlatformTransactionManager transactionManager;

	//Item Reader
	@Bean
	public FlatFileItemReader<Customer> customerReader(){
		
		FlatFileItemReader<Customer> itemReader=new FlatFileItemReader<>();
		itemReader.setResource(new FileSystemResource("src/main/resources/customer_data.csv"));
		itemReader.setName("csv-reader");
		itemReader.setLinesToSkip(1);
		itemReader.setLineMapper(lineMapper());
		
		return itemReader;		
	}

	private LineMapper<Customer> lineMapper() {
		
		DefaultLineMapper<Customer> lineMapper=new DefaultLineMapper<>();
		
		DelimitedLineTokenizer lineTokenizer= new DelimitedLineTokenizer();
		lineTokenizer.setDelimiter(",");
		lineTokenizer.setStrict(false);
		lineTokenizer.setNames("customerID","firstName","lastName","email","phoneNumber","address","city","state","zipCode","country");
		
		BeanWrapperFieldSetMapper<Customer> fieldMapper=new BeanWrapperFieldSetMapper<>();
		fieldMapper.setTargetType(Customer.class);
		
		lineMapper.setLineTokenizer(lineTokenizer);
		lineMapper.setFieldSetMapper(fieldMapper);
		
		return lineMapper;		
	}
	
	//Item Processor
	public CustomerProcessor processCxData() {
		
		return new CustomerProcessor();
	}
	
	//Item Writer
	@Bean
	public RepositoryItemWriter<Customer> itemWriterCx(){

		RepositoryItemWriter<Customer> itemwriter = new RepositoryItemWriter<>();
		itemwriter.setRepository(repo);
		itemwriter.setMethodName("save");
		
		return itemwriter;		
	}
	
	//Step
	@Bean
	public Step step() {
		
		return new StepBuilder("step-1",jobRepo)
				.<Customer,Customer>chunk(100, transactionManager)
				.reader(customerReader())
				.processor(processCxData())
				.writer(itemWriterCx())
				.build();
	}
	
	//job
	@Bean
	public Job job() {
		
		return new JobBuilder("customers-import",jobRepo)
				.start(step()).build();
	}
	
	

}
