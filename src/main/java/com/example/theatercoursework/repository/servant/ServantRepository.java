package com.example.theatercoursework.repository.servant;

import com.example.theatercoursework.model.Servant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServantRepository extends MongoRepository<Servant, String> {
}
