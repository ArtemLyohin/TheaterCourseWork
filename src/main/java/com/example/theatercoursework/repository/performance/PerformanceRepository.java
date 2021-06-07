package com.example.theatercoursework.repository.performance;

import com.example.theatercoursework.model.Performance;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface PerformanceRepository extends MongoRepository<Performance, String> {
}
