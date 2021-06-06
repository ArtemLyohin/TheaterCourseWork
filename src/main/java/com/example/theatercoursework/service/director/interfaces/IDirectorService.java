package com.example.theatercoursework.service.director.interfaces;

import com.example.theatercoursework.model.Director;

import java.util.List;

public interface IDirectorService {
    Director create(Director director);
    Director update(Director director);
    Director delete(Director director);
    Director getById(String id);
    List<Director> getAll();
}
