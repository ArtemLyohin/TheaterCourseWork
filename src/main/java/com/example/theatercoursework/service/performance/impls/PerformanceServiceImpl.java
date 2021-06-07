package com.example.theatercoursework.service.performance.impls;

import com.example.theatercoursework.data.FakePerformance;
import com.example.theatercoursework.model.Performance;
import com.example.theatercoursework.repository.hall.HallRepository;
import com.example.theatercoursework.repository.performance.PerformanceRepository;
import com.example.theatercoursework.repository.spectacle.SpectacleRepository;
import com.example.theatercoursework.repository.theater.TheaterRepository;
import com.example.theatercoursework.service.performance.interfaces.IPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PerformanceServiceImpl implements IPerformanceService {
    @Autowired
    PerformanceRepository repository;

    @Autowired
    FakePerformance fakePerformance;

    @Autowired
    SpectacleRepository spectacleRepository;

    @Autowired
    HallRepository hallRepository;

    @PostConstruct
    void init() {
//        fakePerformance.getPerformances().get(0).setSpectacle(spectacleRepository.findAll().get(0));
//        fakePerformance.getPerformances().get(0).setHall(hallRepository.findAll().get(0));
//
//        fakePerformance.getPerformances().get(1).setSpectacle(spectacleRepository.findAll().get(1));
//        fakePerformance.getPerformances().get(1).setHall(hallRepository.findAll().get(0));
//
//        fakePerformance.getPerformances().get(2).setSpectacle(spectacleRepository.findAll().get(2));
//        fakePerformance.getPerformances().get(2).setHall(hallRepository.findAll().get(1));
//
//        fakePerformance.getPerformances().get(3).setSpectacle(spectacleRepository.findAll().get(3));
//        fakePerformance.getPerformances().get(3).setHall(hallRepository.findAll().get(0));
//
//        fakePerformance.getPerformances().get(4).setSpectacle(spectacleRepository.findAll().get(4));
//        fakePerformance.getPerformances().get(1).setHall(hallRepository.findAll().get(1));
//
//        fakePerformance.getPerformances().get(5).setSpectacle(spectacleRepository.findAll().get(0));
//        fakePerformance.getPerformances().get(5).setHall(hallRepository.findAll().get(1));
//
//        fakePerformance.getPerformances().get(6).setSpectacle(spectacleRepository.findAll().get(1));
//        fakePerformance.getPerformances().get(6).setHall(hallRepository.findAll().get(1));
//
//        fakePerformance.getPerformances().get(7).setSpectacle(spectacleRepository.findAll().get(2));
//        fakePerformance.getPerformances().get(7).setHall(hallRepository.findAll().get(1));
//
//        fakePerformance.getPerformances().get(8).setSpectacle(spectacleRepository.findAll().get(3));
//        fakePerformance.getPerformances().get(8).setHall(hallRepository.findAll().get(0));
//
//        fakePerformance.getPerformances().get(9).setSpectacle(spectacleRepository.findAll().get(4));
//        fakePerformance.getPerformances().get(9).setHall(hallRepository.findAll().get(2));
//
//        repository.saveAll(fakePerformance.getPerformances());
    }

    @Override
    public Performance create(Performance performance) {
        performance.setModified_at(LocalDateTime.now());
        performance.setCreated_at(LocalDateTime.now());

        return repository.save(performance);
    }

    @Override
    public Performance update(Performance performance) {
        performance.setModified_at(LocalDateTime.now());

        return repository.save(performance);
    }

    @Override
    public Performance delete(Performance performance) {
        repository.delete(performance);

        return performance;
    }

    @Override
    public Performance getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Performance> getAll() {
        return repository.findAll();
    }
}
