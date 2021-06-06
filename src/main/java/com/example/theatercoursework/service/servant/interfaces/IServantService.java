package com.example.theatercoursework.service.servant.interfaces;

import com.example.theatercoursework.model.Servant;

import java.util.List;

public interface IServantService {
    Servant create(Servant servant);
    Servant update(Servant servant);
    Servant delete(Servant servant);
    Servant getById(String id);
    List<Servant> getAll();
}
