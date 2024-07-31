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
import com.telusko.SpringDataJpaProject01.view.ResultView1;
import com.telusko.SpringDataJpaProject01.view.ResultView2;
import com.telusko.SpringDataJpaProject01.view.ResultView3;


@SpringBootApplication
public class SpringDataJpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(SpringDataJpaProject01Application.class, args);
		
		IVaccineService service=container.getBean(VaccineServiceImpl.class);
	
//	    service.fetchByVaccineCostLessThan(45000.0, ResultView1.class).
//	    forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()));
	
//	    service.fetchByVaccineCostLessThan(45000.0, ResultView2.class).
//	    forEach(v->System.out.println(v.getVaccineName()+" : "+v.getVaccineCompany()
//	    +" : "+v.getVaccineCost()));
		
		service.fetchByVaccineCostLessThan(45000.0, ResultView3.class).
	    forEach(v->System.out.println(v.getId()+" : "+v.getVaccineName()));
	    
	}

}
