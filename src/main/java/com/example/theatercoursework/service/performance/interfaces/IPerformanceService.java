package com.example.theatercoursework.service.performance.interfaces;

import com.example.theatercoursework.model.Performance;

import java.util.List;

public interface IPerformanceService {
    Performance create(Performance performance);
    Performance update(Performance performance);
    Performance delete(Performance performance);
    Performance getById(String id);
    List<Performance> getAll();
}
