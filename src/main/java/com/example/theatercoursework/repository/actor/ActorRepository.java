package com.example.theatercoursework.repository.actor;

import com.example.theatercoursework.model.Actor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends MongoRepository<Actor, String> {
}
