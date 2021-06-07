package com.example.theatercoursework.service.hall.impls;

import com.example.theatercoursework.data.FakeHall;
import com.example.theatercoursework.model.Hall;
import com.example.theatercoursework.repository.hall.HallRepository;
import com.example.theatercoursework.repository.theater.TheaterRepository;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import com.example.theatercoursework.service.hall.interfaces.IHallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class HallServiceImpl implements IHallService {
    @Autowired
    HallRepository repository;

    @Autowired
    FakeHall fakeHall;

    @Autowired
    TheaterRepository theaterRepository;

    @PostConstruct
    void init() {
//        fakeHall.getHalls().forEach(item -> item.setTheater(theaterRepository.findAll().get(0)));
//        repository.saveAll(fakeHall.getHalls());
    }

    @Override
    public Hall create(Hall hall) {
        hall.setModified_at(LocalDateTime.now());
        hall.setCreated_at(LocalDateTime.now());

        return repository.save(hall);
    }

    @Override
    public Hall update(Hall hall) {
        hall.setModified_at(LocalDateTime.now());

        return repository.save(hall);
    }

    @Override
    public Hall delete(Hall hall) {
        repository.delete(hall);

        return hall;
    }

    @Override
    public Hall getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Hall> getAll() {
        return repository.findAll();
    }
}
