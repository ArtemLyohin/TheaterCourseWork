package com.example.theatercoursework.service.musician.interfaces;

import com.example.theatercoursework.model.Musician;

import java.util.List;

public interface IMusicianService {
    Musician create(Musician musician);
    Musician update(Musician musician);
    Musician delete(Musician musician);
    Musician getById(String id);
    List<Musician> getAll();
}
