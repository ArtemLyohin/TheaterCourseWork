package com.example.theatercoursework.service.spectacle.impls;

import com.example.theatercoursework.data.FakeSpectacle;
import com.example.theatercoursework.model.Spectacle;
import com.example.theatercoursework.repository.actor.ActorRepository;
import com.example.theatercoursework.repository.hall.HallRepository;
import com.example.theatercoursework.repository.musician.MusicianRepository;
import com.example.theatercoursework.repository.producer.ProducerRepository;
import com.example.theatercoursework.repository.spectacle.SpectacleRepository;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import com.example.theatercoursework.service.spectacle.interfaces.ISpectacleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Service
public class SpectacleServiceImpl implements ISpectacleService {
    @Autowired
    SpectacleRepository repository;

    @Autowired
    FakeSpectacle fakeSpectacle;

    @Autowired
    ActorRepository actorRepository;

    @Autowired
    ProducerRepository producerRepository;

    @Autowired
    MusicianRepository musicianRepository;

    @PostConstruct
    void init() {
//        fakeSpectacle.getSpectacles().get(0).setMainRoles(Arrays.asList(
//                actorRepository.findAll().get(0),
//                actorRepository.findAll().get(1),
//                actorRepository.findAll().get(4)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(0).setUnderstudies(Arrays.asList(
//                actorRepository.findAll().get(8),
//                actorRepository.findAll().get(9),
//                actorRepository.findAll().get(12)
//                                                                          ));
//        fakeSpectacle.getSpectacles().get(0).setSecondaryRoles(Arrays.asList(
//                actorRepository.findAll().get(6),
//                actorRepository.findAll().get(2)
//                                                                            ));
//        fakeSpectacle.getSpectacles().get(0).setMusicians(Arrays.asList(
//                musicianRepository.findAll().get(0),
//                musicianRepository.findAll().get(1)
//                                                                            ));
//        fakeSpectacle.getSpectacles().get(0).setDirector(producerRepository.findAll().get(0));
//        fakeSpectacle.getSpectacles().get(0).setArtist(producerRepository.findAll().get(3));
//        fakeSpectacle.getSpectacles().get(0).setConductor(producerRepository.findAll().get(6));
//        fakeSpectacle.getSpectacles().get(0).setAuthor(producerRepository.findAll().get(9));
//        // NEW
//        fakeSpectacle.getSpectacles().get(1).setMainRoles(Arrays.asList(
//                actorRepository.findAll().get(0),
//                actorRepository.findAll().get(3)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(1).setUnderstudies(Arrays.asList(
//                actorRepository.findAll().get(8),
//                actorRepository.findAll().get(11)
//                                                                          ));
//        fakeSpectacle.getSpectacles().get(1).setSecondaryRoles(Arrays.asList(
//                actorRepository.findAll().get(7),
//                actorRepository.findAll().get(15),
//                actorRepository.findAll().get(10)
//                                                                            ));
//        fakeSpectacle.getSpectacles().get(1).setMusicians(Arrays.asList(
//                musicianRepository.findAll().get(1),
//                musicianRepository.findAll().get(2)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(1).setDirector(producerRepository.findAll().get(1));
//        fakeSpectacle.getSpectacles().get(1).setArtist(producerRepository.findAll().get(4));
//        fakeSpectacle.getSpectacles().get(1).setConductor(producerRepository.findAll().get(7));
//        fakeSpectacle.getSpectacles().get(1).setAuthor(producerRepository.findAll().get(8));
//        // NEW
//        fakeSpectacle.getSpectacles().get(2).setMainRoles(Arrays.asList(
//                actorRepository.findAll().get(5),
//                actorRepository.findAll().get(6)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(2).setUnderstudies(Arrays.asList(
//                actorRepository.findAll().get(13),
//                actorRepository.findAll().get(14)
//                                                                          ));
//        fakeSpectacle.getSpectacles().get(2).setSecondaryRoles(Arrays.asList(
//                actorRepository.findAll().get(1),
//                actorRepository.findAll().get(3),
//                actorRepository.findAll().get(8),
//                actorRepository.findAll().get(9)
//                                                                            ));
//        fakeSpectacle.getSpectacles().get(2).setMusicians(Arrays.asList(
//                musicianRepository.findAll().get(3)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(2).setDirector(producerRepository.findAll().get(2));
//        fakeSpectacle.getSpectacles().get(2).setArtist(producerRepository.findAll().get(5));
//        fakeSpectacle.getSpectacles().get(2).setConductor(producerRepository.findAll().get(7));
//        fakeSpectacle.getSpectacles().get(2).setAuthor(producerRepository.findAll().get(8));
//        // NEW
//        fakeSpectacle.getSpectacles().get(3).setMainRoles(Arrays.asList(
//                actorRepository.findAll().get(3),
//                actorRepository.findAll().get(6)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(3).setUnderstudies(Arrays.asList(
//                actorRepository.findAll().get(11),
//                actorRepository.findAll().get(14)
//                                                                          ));
//        fakeSpectacle.getSpectacles().get(3).setSecondaryRoles(Arrays.asList(
//                actorRepository.findAll().get(2),
//                actorRepository.findAll().get(7),
//                actorRepository.findAll().get(12),
//                actorRepository.findAll().get(15)
//                                                                            ));
//        fakeSpectacle.getSpectacles().get(3).setMusicians(Arrays.asList(
//                musicianRepository.findAll().get(4),
//                musicianRepository.findAll().get(1)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(3).setDirector(producerRepository.findAll().get(1));
//        fakeSpectacle.getSpectacles().get(3).setArtist(producerRepository.findAll().get(5));
//        fakeSpectacle.getSpectacles().get(3).setConductor(producerRepository.findAll().get(7));
//        fakeSpectacle.getSpectacles().get(3).setAuthor(producerRepository.findAll().get(9));
//        // NEW
//        fakeSpectacle.getSpectacles().get(4).setMainRoles(Arrays.asList(
//                actorRepository.findAll().get(0),
//                actorRepository.findAll().get(2),
//                actorRepository.findAll().get(3)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(4).setUnderstudies(Arrays.asList(
//                actorRepository.findAll().get(8),
//                actorRepository.findAll().get(10),
//                actorRepository.findAll().get(11)
//                                                                          ));
//        fakeSpectacle.getSpectacles().get(4).setSecondaryRoles(Arrays.asList(
//                actorRepository.findAll().get(4),
//                actorRepository.findAll().get(1),
//                actorRepository.findAll().get(12),
//                actorRepository.findAll().get(5)
//                                                                            ));
//        fakeSpectacle.getSpectacles().get(4).setMusicians(Arrays.asList(
//                musicianRepository.findAll().get(0),
//                musicianRepository.findAll().get(4)
//                                                                       ));
//        fakeSpectacle.getSpectacles().get(4).setDirector(producerRepository.findAll().get(2));
//        fakeSpectacle.getSpectacles().get(4).setArtist(producerRepository.findAll().get(5));
//        fakeSpectacle.getSpectacles().get(4).setConductor(producerRepository.findAll().get(6));
//        fakeSpectacle.getSpectacles().get(4).setAuthor(producerRepository.findAll().get(9));
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
