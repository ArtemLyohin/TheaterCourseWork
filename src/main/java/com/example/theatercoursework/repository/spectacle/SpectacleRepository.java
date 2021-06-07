package com.example.theatercoursework.repository.spectacle;

import com.example.theatercoursework.model.Spectacle;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpectacleRepository extends MongoRepository<Spectacle, String> {
}
