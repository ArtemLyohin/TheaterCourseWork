package com.example.theatercoursework.service.spectacle.impls;

import com.example.theatercoursework.data.FakeSpectacle;
import com.example.theatercoursework.model.Spectacle;
import com.example.theatercoursework.repository.spectacle.SpectacleRepository;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import com.example.theatercoursework.service.spectacle.interfaces.ISpectacleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class SpectacleServiceImpl implements ISpectacleService {
    @Autowired
    SpectacleRepository repository;

    @Autowired
    FakeSpectacle fakeSpectacle;


    @PostConstruct
    void init() {
//        repository.saveAll(fakeSpectacle.getSpectacles());
    }

    @Override
    public Spectacle create(Spectacle spectacle) {
        spectacle.setModified_at(LocalDateTime.now());
        spectacle.setCreated_at(LocalDateTime.now());

        return repository.save(spectacle);
    }

    @Override
    public Spectacle update(Spectacle spectacle) {
        spectacle.setModified_at(LocalDateTime.now());

        return repository.save(spectacle);
    }

    @Override
    public Spectacle delete(Spectacle spectacle) {
        repository.delete(spectacle);

        return spectacle;
    }

    @Override
    public Spectacle getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Spectacle> getAll() {
        return repository.findAll();
    }
}
