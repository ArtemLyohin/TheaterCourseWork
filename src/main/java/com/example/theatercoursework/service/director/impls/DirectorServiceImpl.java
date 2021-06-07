package com.example.theatercoursework.service.director.impls;

import com.example.theatercoursework.data.FakeDirector;
import com.example.theatercoursework.model.Director;
import com.example.theatercoursework.repository.director.DirectorRepository;
import com.example.theatercoursework.repository.theater.TheaterRepository;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import com.example.theatercoursework.service.director.interfaces.IDirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class DirectorServiceImpl implements IDirectorService {
    @Autowired
    DirectorRepository repository;

    @Autowired
    FakeDirector fakeDirector;

    @Autowired
    EmployeeServiceImpl employeeService;

    @Autowired
    TheaterRepository theaterRepository;

    @PostConstruct
    void init() {
//        fakeDirector.getDirectors().forEach(item -> item.setTheater(theaterRepository.findAll().get(0)));
//        repository.saveAll(fakeDirector.getDirectors());
    }

    @Override
    public Director create(Director director) {
        director.setModified_at(LocalDateTime.now());
        director.setCreated_at(LocalDateTime.now());
        employeeService.create(director);
        return repository.save(director);
    }

    @Override
    public Director update(Director director) {
        director.setModified_at(LocalDateTime.now());
        employeeService.update(director);
        return repository.save(director);
    }

    @Override
    public Director delete(Director director) {
        repository.delete(director);
        employeeService.delete(director);
        return director;
    }

    @Override
    public Director getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Director> getAll() {
        return repository.findAll();
    }
}
