package com.example.theatercoursework.service.producer.interfaces;

import com.example.theatercoursework.model.Producer;

import java.util.List;

public interface IProducerService {
    Producer create(Producer producer);
    Producer update(Producer producer);
    Producer delete(Producer producer);
    Producer getById(String id);
    List<Producer> getAll();
}
