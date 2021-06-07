package com.example.theatercoursework.service.touring.interfaces;

import com.example.theatercoursework.model.Touring;

import java.util.List;

public interface ITouringService {
    Touring create(Touring touring);
    Touring update(Touring touring);
    Touring delete(Touring touring);
    Touring getById(String id);
    List<Touring> getAll();
}
