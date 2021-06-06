package com.example.theatercoursework.service.musician.impls;

import com.example.theatercoursework.data.FakeMusician;
import com.example.theatercoursework.model.Musician;
import com.example.theatercoursework.repository.musician.MusicianRepository;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import com.example.theatercoursework.service.musician.interfaces.IMusicianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MusicianServiceImpl implements IMusicianService {
    @Autowired
    MusicianRepository repository;

    @Autowired
    FakeMusician fakeMusician;

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostConstruct
    void init() {
//        repository.saveAll(fakeMusician.getMusicians());
    }

    @Override
    public Musician create(Musician musician) {
        musician.setModified_at(LocalDateTime.now());
        musician.setCreated_at(LocalDateTime.now());
        employeeService.create(musician);
        return repository.save(musician);
    }

    @Override
    public Musician update(Musician musician) {
        musician.setModified_at(LocalDateTime.now());
        employeeService.update(musician);
        return repository.save(musician);
    }

    @Override
    public Musician delete(Musician musician) {
        repository.delete(musician);
        employeeService.delete(musician);
        return musician;
    }

    @Override
    public Musician getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Musician> getAll() {
        return repository.findAll();
    }
}
