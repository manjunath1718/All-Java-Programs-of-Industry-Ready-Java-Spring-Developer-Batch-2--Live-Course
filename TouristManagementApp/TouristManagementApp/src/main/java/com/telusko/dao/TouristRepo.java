package com.telusko.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.telusko.model.Tourist;

public interface TouristRepo extends MongoRepository<Tourist, String> {

}
