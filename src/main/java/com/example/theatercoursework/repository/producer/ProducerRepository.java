package com.example.theatercoursework.repository.producer;

import com.example.theatercoursework.model.Producer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProducerRepository extends MongoRepository<Producer, String> {
}
