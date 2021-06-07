package com.example.theatercoursework.repository.theater;

import com.example.theatercoursework.model.Theater;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TheaterRepository extends MongoRepository<Theater, String> {
}
