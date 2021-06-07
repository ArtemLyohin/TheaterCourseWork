package com.example.theatercoursework.service.spectacle.interfaces;

import com.example.theatercoursework.model.Spectacle;

import java.util.List;

public interface ISpectacleService {
    Spectacle create(Spectacle spectacle);
    Spectacle update(Spectacle spectacle);
    Spectacle delete(Spectacle spectacle);
    Spectacle getById(String id);
    List<Spectacle> getAll();
}
