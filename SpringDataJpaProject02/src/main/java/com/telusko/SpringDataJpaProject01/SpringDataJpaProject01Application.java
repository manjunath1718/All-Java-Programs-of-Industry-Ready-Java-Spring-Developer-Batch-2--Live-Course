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
		
//		Vaccine v=new Vaccine("CovidShield", "Astrazenica", 55555.4);
//		String msg = service.registerVaccineInfo(v);
//		System.out.println(msg);
		
//		Vaccine v2=new Vaccine("Covaxin", "BharatBio", 4544.4);
//		Vaccine v3=new Vaccine("Pfizer", "Moderna", 454544.4);
//		Vaccine v4=new Vaccine("Sputnik", "Russian", 35454.4);
//		
//		ArrayList<Vaccine> list = new ArrayList<>();
//		list.add(v2);
//		list.add(v3);
//		list.add(v4);
//		
//		service.registerMultipleVaccines(list).forEach(v->System.out.println(v));
		
//		Long count = service.getCount();
//		System.out.println(count);
		
//		Integer id=5;
//		boolean status=service.checkAvailability(id);
//		if(status)
//			System.out.println("Vaccine with id : "+ id + " is available");
//		else
//			System.out.println("Vaccine with id : "+ id + " is not available");
	   
//		service.getAllVaccineInfo().forEach(v->System.out.println(v));
		
//		ArrayList<Integer> idList=new ArrayList<>();		
//		idList.add(1);
//		idList.add(3);
//		idList.add(4);
//		service.getAllVaccineInfo(idList).forEach(v->System.out.println(v));
		
		
		Vaccine vc = service.fetchVaccineByid(2);
		System.out.println(vc);
		
//		System.out.println(service.deleteVaccineByid(5));
		
	}

}
