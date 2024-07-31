package com.telusko.SpringDataJpaProject01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;
import com.telusko.SpringDataJpaProject01.service.IVaccineService;
import com.telusko.SpringDataJpaProject01.service.VaccineServiceImpl;


@SpringBootApplication
public class SpringDataJpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProject01Application.class, args);
		
		IVaccineService service=container.getBean(VaccineServiceImpl.class);
	
	    service.fetchByVaccineCostLessThan(45000.0).
	    forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));
	
	}

}
