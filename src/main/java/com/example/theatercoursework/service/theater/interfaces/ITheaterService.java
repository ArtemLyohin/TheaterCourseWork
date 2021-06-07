package com.example.theatercoursework.service.theater.interfaces;

import com.example.theatercoursework.model.Theater;

import java.util.List;

public interface ITheaterService {
    Theater create(Theater theater);
    Theater update(Theater theater);
    Theater delete(Theater theater);
    Theater getById(String id);
    List<Theater> getAll();
}
