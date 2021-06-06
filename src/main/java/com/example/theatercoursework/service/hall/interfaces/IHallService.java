package com.example.theatercoursework.service.hall.interfaces;

import com.example.theatercoursework.model.Hall;

import java.util.List;

public interface IHallService {
    Hall create(Hall hall);
    Hall update(Hall hall);
    Hall delete(Hall hall);
    Hall getById(String id);
    List<Hall> getAll();
}
