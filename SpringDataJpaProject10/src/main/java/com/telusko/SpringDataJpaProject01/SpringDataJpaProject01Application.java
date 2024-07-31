package com.telusko.SpringDataJpaProject01;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject01.entity.JobSeeker;
import com.telusko.SpringDataJpaProject01.service.JobSeekerService;


@SpringBootApplication
public class SpringDataJpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProject01Application.class, args);

		JobSeekerService service = container.getBean(JobSeekerService.class);
		
//		JobSeeker jobSeeker=new JobSeeker();
//		jobSeeker.setName("raj");
//		jobSeeker.setDob(LocalDate.of(1999, 2, 25));
//		
//		byte[] image = null;
//		char[] textFile = null;
//		
//		FileInputStream inputStream = null;
//		FileReader reader;
//		
//		try {
//			inputStream = new FileInputStream("D:\\IO\\FileHandling\\beluru.png");
//			image=new byte[inputStream.available()];
//			inputStream.read(image);
//			
//			File file=new File("D:\\IO\\FileHandling\\jobSeekserInfo.txt");
//			reader=new FileReader(file);
//			textFile =new char[(int)file.length()];
//			reader.read(textFile);
//			
//		} catch (FileNotFoundException e) {
//			
//			e.printStackTrace();
//		} catch (IOException e) {
//			
//			e.printStackTrace();
//		}finally {
//			reader.close();
//			inputStream.close();
//		}
//		
//		
//		jobSeeker.setImage(image);
//		jobSeeker.setTextFile(textFile);
//		String msg = service.registerJobSeeker(jobSeeker);
//		System.out.println(msg);
		
		Optional<JobSeeker> optional = service.getJobSeekerById(1);
		JobSeeker jobSeeker = optional.get();
		System.out.println(jobSeeker.getName()+" : "+jobSeeker.getDob());
				
		FileWriter writer = null;
		FileOutputStream outputStream = null;
		
		File file=new File("Resume.txt");
		try {
			writer= new FileWriter(file);
			writer.write(jobSeeker.getTextFile());
			
			outputStream= new FileOutputStream("jobseekerphoto.jpg");
			outputStream.write(jobSeeker.getImage());
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				writer.close();
				outputStream.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
