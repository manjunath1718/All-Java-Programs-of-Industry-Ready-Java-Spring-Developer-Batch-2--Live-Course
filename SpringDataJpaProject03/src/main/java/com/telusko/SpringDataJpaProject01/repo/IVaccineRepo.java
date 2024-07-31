package com.telusko.SpringDataJpaProject01.repo;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.telusko.SpringDataJpaProject01.entity.Vaccine;

public interface IVaccineRepo extends PagingAndSortingRepository<Vaccine, Integer> {

}
