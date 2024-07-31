package com.telusko.SpringDataJpaProject01;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject01.entity.CustomerInfo;
import com.telusko.SpringDataJpaProject01.service.ICustomerService;


@SpringBootApplication
public class SpringDataJpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProject01Application.class, args);

		ICustomerService service=container.getBean(ICustomerService.class);
		
//		CustomerInfo cx=new CustomerInfo();
//		cx.setName("kunal");
//		cx.setCity("pune");
//		cx.setDob(LocalDateTime.of(1993, 2, 11, 1, 55));
//		cx.setRegDate(LocalDate.of(2024, 11, 14));
//		cx.setRegtime(LocalTime.now());
//		String status = service.registerCustomerInfo(cx);
//		System.out.println(status);
		
		service.fetchAllCx().forEach(v->System.out.println(v));
		
	}

}
