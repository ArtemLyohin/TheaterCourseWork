package com.example.theatercoursework.service.actor.impls;

import com.example.theatercoursework.data.FakeActor;
import com.example.theatercoursework.model.Actor;
import com.example.theatercoursework.model.enums.Voice;
import com.example.theatercoursework.repository.actor.ActorRepository;
import com.example.theatercoursework.repository.theater.TheaterRepository;
import com.example.theatercoursework.repository.touring.TouringRepository;
import com.example.theatercoursework.service.actor.interfaces.IActorService;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class ActorServiceImpl implements IActorService {
    @Autowired
    ActorRepository repository;

    @Autowired
    FakeActor fakeActor;

    @Autowired
    EmployeeServiceImpl employeeService;

    @Autowired
    TheaterRepository theaterRepository;

    @Autowired
    TouringRepository touringRepository;

    @PostConstruct
    void init() {
//        fakeActor.getActors()
//                 .stream()
//                 .filter(Objects::nonNull)
//                 .forEach(item -> item.setTheater(theaterRepository.findAll()
//                                                                   .get(0)));
//        repository.saveAll(fakeActor.getActors().stream().filter(Objects::nonNull).collect(Collectors.toList()));
    }

    @Override
    public Actor create(Actor actor) {
        actor.setVoice(Voice.ALTO);
        actor.setModified_at(LocalDateTime.now());
        actor.setCreated_at(LocalDateTime.now());
        employeeService.create(actor);
        return repository.save(actor);
    }

    @Override
    public Actor update(Actor actor) {
        actor.setModified_at(LocalDateTime.now());
        employeeService.update(actor);
        return repository.save(actor);
    }

    @Override
    public Actor delete(Actor actor) {
        repository.delete(actor);
        employeeService.delete(actor);
        return actor;
    }

    @Override
    public Actor getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Actor> getAll() {
        return repository.findAll();
    }


}
