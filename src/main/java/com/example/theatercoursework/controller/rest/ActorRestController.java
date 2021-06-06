package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Actor;
import com.example.theatercoursework.service.actor.impls.ActorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/actors")
public class ActorRestController {
    @Autowired
    ActorServiceImpl service;

    @GetMapping
    public List<Actor> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Actor getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Actor delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Actor create(@RequestBody Actor actor){
        return service.create(actor);
    }

    @PostMapping("/edit/{id}")
    public Actor update(@PathVariable String id,
                           @RequestBody Actor actor){
        actor.setId(service.getById(id).getId());
        actor.setCreated_at(service.getById(id).getCreated_at());
        return service.update(actor);
    }


}
