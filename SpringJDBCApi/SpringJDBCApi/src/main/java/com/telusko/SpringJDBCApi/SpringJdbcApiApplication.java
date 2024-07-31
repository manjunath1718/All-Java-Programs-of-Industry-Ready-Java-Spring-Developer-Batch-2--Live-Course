package com.telusko.SpringJDBCApi;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringJDBCApi.dao.Implementers;
import com.telusko.SpringJDBCApi.dao.ImplementersDaoImpl;

@SpringBootApplication
public class SpringJdbcApiApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext container = SpringApplication.run(SpringJdbcApiApplication.class, args);
	
		ImplementersDaoImpl dao = container.getBean(ImplementersDaoImpl.class);
	
//		List<Implementers> list = dao.getImplementersInfo();
//		for(Implementers i: list) {
//			System.out.println(i);
//		}
		
		dao.getImplementersInfo().forEach(i->System.out.println(i));
		
	}

}
