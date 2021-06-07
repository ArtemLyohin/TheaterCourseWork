package com.example.theatercoursework.repository.performance;

import com.example.theatercoursework.model.Performance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PerformanceRepository extends MongoRepository<Performance, String> {
}
