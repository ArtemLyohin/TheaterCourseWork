package com.example.theatercoursework.repository.director;

import com.example.theatercoursework.model.Director;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DirectorRepository extends MongoRepository<Director, String> {
}
