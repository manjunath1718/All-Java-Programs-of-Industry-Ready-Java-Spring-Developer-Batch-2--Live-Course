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

//		System.out.println(service.searchByVaccineCompany("Bharatbio"));

//		service.searchByVaccineCompanies("Bharatbio","Astrazenica","Moderna").
//		forEach(v->System.out.println(v));
	
//		service.searchByTwoVaccineCompany("BharatBio","Astrazenica").
//		forEach(v->System.out.println(v));
		
//		service.searchByVaccinecostBetween(45000.0, 70000.0).
//		forEach(v->System.out.println(v[0]+"====>"+v[1]));//if we declare return type as List<Object[]> in IVaccineRepo
		
//		service.searchByVaccinecostBetween(45000.0, 70000.0).
//		forEach(v->System.out.println(v));//if we declare return type as List<String> in IVaccineRepo
	
//		service.searchByVaccinecostBetween(30000.0, 70000.0).
//		forEach(v->System.out.println(v.get(0)+" : "+v.get(1)));//if we declare return type as List<List<String>> in IVaccineRepo
		
//		int rowsAffected=service.updateVaccinePriceByVaccineName("covaxin", 44444.4);
//		System.out.println("No of rows affected "+rowsAffected);
		
//		int rowsAffectedByDel=service.deleteVaccineByVaccineCostRange(2222.0, 3000.0);
//		System.out.println("No of rows affected "+rowsAffectedByDel);
		
		int rowsAffected = service.insertVaccineDetailsBySql(4545.6,"Astrazenca", "covishieldbooster",13);
		System.out.println("No of Rows Affected "+rowsAffected);
	}

}
