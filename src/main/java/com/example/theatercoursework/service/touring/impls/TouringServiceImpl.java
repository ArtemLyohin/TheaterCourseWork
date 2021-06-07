package com.example.theatercoursework.service.touring.impls;

import com.example.theatercoursework.data.FakeTouring;
import com.example.theatercoursework.model.Touring;
import com.example.theatercoursework.repository.actor.ActorRepository;
import com.example.theatercoursework.repository.producer.ProducerRepository;
import com.example.theatercoursework.repository.spectacle.SpectacleRepository;
import com.example.theatercoursework.repository.touring.TouringRepository;
import com.example.theatercoursework.service.touring.interfaces.ITouringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class TouringServiceImpl implements ITouringService {
    @Autowired
    TouringRepository repository;

    @Autowired
    FakeTouring fakeTouring;

   @Autowired
   SpectacleRepository spectacleRepository;

    @PostConstruct
    void init() {
//        fakeTouring.getTourings().get(0).setSpectacle(spectacleRepository.findAll().get(0));
//        fakeTouring.getTourings().get(1).setSpectacle(spectacleRepository.findAll().get(1));
//        fakeTouring.getTourings().get(2).setSpectacle(spectacleRepository.findAll().get(2));
//        fakeTouring.getTourings().get(3).setSpectacle(spectacleRepository.findAll().get(3));
//        fakeTouring.getTourings().get(4).setSpectacle(spectacleRepository.findAll().get(4));
//        repository.saveAll(fakeTouring.getTourings());
    }

    @Override
    public Touring create(Touring touring) {
        touring.setModified_at(LocalDateTime.now());
        touring.setCreated_at(LocalDateTime.now());

        return repository.save(touring);
    }

    @Override
    public Touring update(Touring touring) {
        touring.setModified_at(LocalDateTime.now());

        return repository.save(touring);
    }

    @Override
    public Touring delete(Touring touring) {
        repository.delete(touring);

        return touring;
    }

    @Override
    public Touring getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Touring> getAll() {
        return repository.findAll();
    }
}
