package com.telusko.SpringDataJpaProject01;

import java.util.ArrayList;

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
		
//		service.fetchDetails(true, "vaccineName","vaccineCompany").
//		forEach(v->System.out.println(v));

		service.fetchDetails(false, "vaccineName","vaccineCompany").
		forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));
		
//		service.fetchDetails(0,3,true, "vaccineName","vaccineCompany").
//		forEach(v->System.out.println(v));
//		service.fetchAllPageDetails(4);
		
//		service.getAllPageDetails(2).forEach(v->System.out.println(v));
		
	}

}
