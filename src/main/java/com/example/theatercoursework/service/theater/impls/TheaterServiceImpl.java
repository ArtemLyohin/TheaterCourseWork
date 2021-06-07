package com.example.theatercoursework.service.theater.impls;

import com.example.theatercoursework.data.FakeTheater;
import com.example.theatercoursework.model.Hall;
import com.example.theatercoursework.model.Theater;
import com.example.theatercoursework.repository.actor.ActorRepository;
import com.example.theatercoursework.repository.hall.HallRepository;
import com.example.theatercoursework.repository.producer.ProducerRepository;
import com.example.theatercoursework.repository.theater.TheaterRepository;
import com.example.theatercoursework.service.theater.interfaces.ITheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TheaterServiceImpl implements ITheaterService {
    @Autowired
    TheaterRepository repository;

    @Autowired
    FakeTheater fakeTheater;

    @PostConstruct
    void init() {
//        repository.saveAll(fakeTheater.getTheaters());
    }

    @Override
    public Theater create(Theater theater) {
        theater.setModified_at(LocalDateTime.now());
        theater.setCreated_at(LocalDateTime.now());

        return repository.save(theater);
    }

    @Override
    public Theater update(Theater theater) {
        theater.setModified_at(LocalDateTime.now());

        return repository.save(theater);
    }

    @Override
    public Theater delete(Theater theater) {
        repository.delete(theater);

        return theater;
    }

    @Override
    public Theater getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Theater> getAll() {
        return repository.findAll();
    }
}
