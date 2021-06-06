package com.example.theatercoursework.service.employee.impls;

import com.example.theatercoursework.data.FakeActor;
import com.example.theatercoursework.data.FakeEmployee;
import com.example.theatercoursework.model.Actor;
import com.example.theatercoursework.model.Employee;
import com.example.theatercoursework.repository.actor.ActorRepository;
import com.example.theatercoursework.repository.director.DirectorRepository;
import com.example.theatercoursework.repository.employee.EmployeeRepository;
import com.example.theatercoursework.repository.musician.MusicianRepository;
import com.example.theatercoursework.repository.producer.ProducerRepository;
import com.example.theatercoursework.repository.servant.ServantRepository;
import com.example.theatercoursework.service.employee.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
    @Autowired
    EmployeeRepository repository;

    @Autowired
    FakeEmployee fakeEmployee;

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    MusicianRepository musicianRepository;

    @Autowired
    ProducerRepository producerRepository;

    @Autowired
    ServantRepository servantRepository;

    @Autowired
    DirectorRepository directorRepository;

    @PostConstruct
    void init() {
//        repository.saveAll(actorRepository.findAll()
//                                          .stream()
//                                          .map(item -> new Employee(item.getId(), item.getName(), item.getSex(),
//                                                                    item.getBirthDate(), item.getEmployeeType(),
//                                                                    item.getSalary(),
//                                                                    item.getEmploymentDate(), item.getDescription(),
//                                                                    item.getCreated_at(), item.getModified_at()))
//                                          .collect(Collectors.toList()));
//
//        repository.saveAll(musicianRepository.findAll()
//                                             .stream()
//                                             .map(item -> new Employee(item.getId(), item.getName(), item.getSex(),
//                                                                       item.getBirthDate(), item.getEmployeeType(),
//                                                                       item.getSalary(),
//                                                                       item.getEmploymentDate(), item
//                                                                       .getDescription(),
//                                                                       item.getCreated_at(), item.getModified_at()))
//                                             .collect(Collectors.toList()));
//
//        repository.saveAll(producerRepository.findAll()
//                                             .stream()
//                                             .map(item -> new Employee(item.getId(), item.getName(), item.getSex(),
//                                                                       item.getBirthDate(), item.getEmployeeType(),
//                                                                       item.getSalary(),
//                                                                       item.getEmploymentDate(), item
//                                                                       .getDescription(),
//                                                                       item.getCreated_at(), item.getModified_at()))
//                                             .collect(Collectors.toList()));
//
//        repository.saveAll(servantRepository.findAll()
//                                            .stream()
//                                            .map(item -> new Employee(item.getId(), item.getName(), item.getSex(),
//                                                                      item.getBirthDate(), item.getEmployeeType(),
//                                                                      item.getSalary(),
//                                                                      item.getEmploymentDate(), item.getDescription(),
//                                                                      item.getCreated_at(), item.getModified_at()))
//                                            .collect(Collectors.toList()));
//  repository.saveAll(directorRepository.findAll()
//                                            .stream()
//                                            .map(item -> new Employee(item.getId(), item.getName(), item.getSex(),
//                                                                      item.getBirthDate(), item.getEmployeeType(),
//                                                                      item.getSalary(),
//                                                                      item.getEmploymentDate(), item.getDescription(),
//                                                                      item.getCreated_at(), item.getModified_at()))
//                                            .collect(Collectors.toList()));


    }

    @Override
    public Employee create(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public Employee delete(Employee employee) {
        repository.delete(employee);
        return employee;
    }

    @Override
    public Employee getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Employee> getAll() {
        return repository.findAll();
    }
}
