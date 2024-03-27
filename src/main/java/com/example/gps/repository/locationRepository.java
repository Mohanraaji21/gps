package com.example.gps.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.gps.model.location;

public interface locationRepository extends MongoRepository<location,String>{
    
}
