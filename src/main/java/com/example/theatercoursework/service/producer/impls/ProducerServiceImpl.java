package com.example.theatercoursework.service.producer.impls;

import com.example.theatercoursework.data.FakeProducer;
import com.example.theatercoursework.model.Producer;
import com.example.theatercoursework.model.Producer;
import com.example.theatercoursework.model.Touring;
import com.example.theatercoursework.repository.producer.ProducerRepository;
import com.example.theatercoursework.repository.theater.TheaterRepository;
import com.example.theatercoursework.repository.touring.TouringRepository;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import com.example.theatercoursework.service.producer.interfaces.IProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ProducerServiceImpl implements IProducerService {
    @Autowired
    ProducerRepository repository;

    @Autowired
    FakeProducer fakeProducer;

    @Autowired
    EmployeeServiceImpl employeeService;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    TouringRepository touringRepository;

    @PostConstruct
    void init() {
//        fakeProducer.getProducers().forEach(item -> item.setTheater(theaterRepository.findAll().get(0)));
//        repository.saveAll(fakeProducer.getProducers());
    }

    @Override
    public Producer create(Producer producer) {
        producer.setModified_at(LocalDateTime.now());
        producer.setCreated_at(LocalDateTime.now());
        employeeService.create(producer);
        return repository.save(producer);
    }

    @Override
    public Producer update(Producer producer) {
        producer.setModified_at(LocalDateTime.now());
        employeeService.update(producer);
        return repository.save(producer);
    }

    @Override
    public Producer delete(Producer producer) {
        repository.delete(producer);
        employeeService.delete(producer);
        return producer;
    }

    @Override
    public Producer getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Producer> getAll() {
        return repository.findAll();
    }

}
