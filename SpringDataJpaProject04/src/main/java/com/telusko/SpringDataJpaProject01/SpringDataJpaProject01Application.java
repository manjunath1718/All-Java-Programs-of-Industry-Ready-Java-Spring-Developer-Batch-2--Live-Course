package com.telusko.SpringDataJpaProject01;

import java.util.ArrayList;
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
		
		Vaccine vacc=new Vaccine("covaxin");
		service.searchByGivenVaccineInfo(vacc, true, "vaccineName","vaccineCompany").
		forEach(v->System.out.println(v));
		
//		Vaccine vacc=new Vaccine("covaxin","BharatBio",4544.4);
//		service.searchByGivenVaccineInfo(vacc, true, "vaccineName","vaccineCompany").
//		forEach(v->System.out.println(v));
		
//		System.out.println(service.searchByVaccineId(2));
		
//		service.searchByVaccineIds(List.of(1, 3, 6)).forEach(v->System.out.println(v));

//		Vaccine vaccineInfo1=new Vaccine("covaxin","BharatBio",4544.4);
//		Vaccine vaccineInfo2=new Vaccine("covaxin");
//		service.searchVaccineByVaccine(vaccineInfo2).forEach(v->System.out.println(v));
	
//		String status=service.removeVaccineByIds(List.of(7, 8));
//		System.out.println(status);
		
//		String status=service.removeVaccineByIdsCRUD(List.of(9, 10));
//		System.out.println(status);
		
		
	}

}
