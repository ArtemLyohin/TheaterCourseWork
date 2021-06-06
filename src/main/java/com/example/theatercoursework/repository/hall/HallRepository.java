package com.example.theatercoursework.repository.hall;

import com.example.theatercoursework.model.Hall;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HallRepository extends MongoRepository<Hall, String> {
}
