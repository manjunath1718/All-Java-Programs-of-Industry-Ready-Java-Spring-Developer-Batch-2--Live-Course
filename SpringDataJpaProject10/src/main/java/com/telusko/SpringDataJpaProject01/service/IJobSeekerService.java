package com.telusko.SpringDataJpaProject01.service;

import java.util.Optional;

import com.telusko.SpringDataJpaProject01.entity.JobSeeker;

public interface IJobSeekerService {

	public String registerJobSeeker(JobSeeker jobSeeker);
	
	public Optional<JobSeeker> getJobSeekerById(Integer id);
}
