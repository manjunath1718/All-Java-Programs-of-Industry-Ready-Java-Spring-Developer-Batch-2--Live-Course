package com.telusko.SpringDataJpaProject01.repo;

import org.springframework.data.repository.CrudRepository;

import com.telusko.SpringDataJpaProject01.entity.JobSeeker;

public interface JobSeekerRepo extends CrudRepository<JobSeeker, Integer> {

}
