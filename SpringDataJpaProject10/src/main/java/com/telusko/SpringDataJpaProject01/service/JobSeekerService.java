package com.telusko.SpringDataJpaProject01.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.SpringDataJpaProject01.entity.JobSeeker;
import com.telusko.SpringDataJpaProject01.repo.JobSeekerRepo;

@Service
public class JobSeekerService implements IJobSeekerService {

	@Autowired
	JobSeekerRepo repo;

	@Override
	public String registerJobSeeker(JobSeeker jobSeeker) {
		JobSeeker js = repo.save(jobSeeker);
		return "JobSeeker Details Recorded with Id "+js.getId();
	}

	@Override
	public Optional<JobSeeker> getJobSeekerById(Integer id) {
		
		return repo.findById(id);
	}
	
	
	
}
