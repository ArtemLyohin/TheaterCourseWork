package com.example.theatercoursework.repository.touring;

import com.example.theatercoursework.model.Touring;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TouringRepository extends MongoRepository<Touring, String> {
}
