package com.telusko;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.service.CustomerDto;
import com.telusko.service.CustomerService;
import com.telusko.util.IdGenerator;

@SpringBootApplication
public class SpringBootMongoDbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringBootMongoDbApplication.class, args);
		
		CustomerService service = container.getBean(CustomerService.class);
		
//		CustomerDto dto= new CustomerDto();
//		dto.setId(IdGenerator.generateId());
//		dto.setCxNo(14);
//		dto.setName("shola");
//		dto.setCity("tanzania");
//		
//		String msg = service.registerCustomerInfo(dto);
//		System.out.println(msg);
		
//		service.deleteDocument("f02f724ee0");
		
		service.fetchAllCx().forEach(c->System.out.println(c));
		
		
	}

}