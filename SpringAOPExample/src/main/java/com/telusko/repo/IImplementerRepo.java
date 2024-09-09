package com.telusko.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.model.Implementers;

public interface IImplementerRepo extends JpaRepository<Implementers, Integer> {

}
