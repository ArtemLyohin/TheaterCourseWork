package com.example.theatercoursework.repository.musician;

import com.example.theatercoursework.model.Musician;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicianRepository extends MongoRepository<Musician, String> {
}
