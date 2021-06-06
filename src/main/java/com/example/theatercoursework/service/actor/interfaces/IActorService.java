package com.example.theatercoursework.service.actor.interfaces;

import com.example.theatercoursework.model.Actor;

import java.util.List;

public interface IActorService {
    Actor create(Actor actor);
    Actor update(Actor actor);
    Actor delete(Actor actor);
    Actor getById(String id);
    List<Actor> getAll();
}
