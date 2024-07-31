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

//[id=1, vaccineName=CovidShield, vaccineCompany=Astrazenica, vaccineCost=45454.4] 
//[id=2, vaccineName=Covaxin, vaccineCompany=BharatBio, vaccineCost=4544.4]
		
//		service.fetchByVaccineName("covaxin").forEach(v->System.out.println(v));
//		service.fetchByVaccineCompany("BharatBio").forEach(v->System.out.println(v));
//		service.fetchByVaccineCost(45454.4).forEach(v->System.out.println(v));
		
//		service.fetchByVaccineNameIn("covaxin","CovidShield").forEach(v->System.out.println(v));
		
		service.fetchByVaccineCostBetween(45000.0, 47000.0).forEach(v->System.out.println(v));
	}

}
