package com.telusko.SpringDataJpaProject01.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;
import com.telusko.SpringDataJpaProject01.repo.IVaccineRepo;

@Service
public class VaccineServiceImpl implements IVaccineService{

	@Autowired
	IVaccineRepo repo;

	@Override
	public Iterable<Vaccine> fetchDetails(Boolean status,String...properties ) {
		
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, properties);
		 
		return repo.findAll(sort);
	}

	@Override
	public List<Vaccine> fetchDetails(int pgNo, int pgSize, Boolean status, String... properties) {
		
		PageRequest pageable = PageRequest.of(pgNo, pgSize, status?Direction.ASC:Direction.DESC, properties);
		Page<Vaccine> page = repo.findAll(pageable);
		return page.getContent();
	}

	@Override
	public void fetchAllPageDetails(int pageSize) {
		
		long count=6l;
		long pageCount=count/pageSize;
		pageCount=count%pageSize==0 ? pageCount:++pageCount;
		
		for(int i=0;i<pageCount;i++) {
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(pageable);
			System.out.println("Page No ==> "+i);
			page.getContent().forEach(v->System.out.println(v));
		}
	}

	@Override
	public ArrayList<Object> getAllPageDetails(int pageSize) {
			
		ArrayList<Object> list=new ArrayList<>();
		long count=6l;
		long pageCount=count/pageSize;
		pageCount=count%pageSize==0 ? pageCount:++pageCount;
		
		for(int i=0;i<pageCount;i++) {
			PageRequest pageable = PageRequest.of(i, pageSize);
			Page<Vaccine> page = repo.findAll(pageable);
			
			list.add(page.getContent());
		}
		
		return list;
	}
	
	

}
