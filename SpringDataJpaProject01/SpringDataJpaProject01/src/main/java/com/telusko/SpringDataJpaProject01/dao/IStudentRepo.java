package com.telusko.SpringDataJpaProject01.dao;

import org.springframework.data.repository.CrudRepository;


public interface IStudentRepo extends CrudRepository<Student, Integer> {

}
