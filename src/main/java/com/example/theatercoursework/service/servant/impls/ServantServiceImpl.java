package com.example.theatercoursework.service.servant.impls;

import com.example.theatercoursework.data.FakeServant;
import com.example.theatercoursework.model.Servant;
import com.example.theatercoursework.repository.servant.ServantRepository;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import com.example.theatercoursework.service.servant.interfaces.IServantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ServantServiceImpl implements IServantService {
    @Autowired
    ServantRepository repository;

    @Autowired
    FakeServant fakeServant;

    @Autowired
    EmployeeServiceImpl employeeService;

    @PostConstruct
    void init() {
        repository.saveAll(fakeServant.getServants());
    }

    @Override
    public Servant create(Servant servant) {
        servant.setModified_at(LocalDateTime.now());
        servant.setCreated_at(LocalDateTime.now());
        employeeService.create(servant);
        return repository.save(servant);
    }

    @Override
    public Servant update(Servant servant) {
        servant.setModified_at(LocalDateTime.now());
        employeeService.update(servant);
        return repository.save(servant);
    }

    @Override
    public Servant delete(Servant servant) {
        repository.delete(servant);
        employeeService.delete(servant);
        return servant;
    }

    @Override
    public Servant getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Servant> getAll() {
        return repository.findAll();
    }
}
