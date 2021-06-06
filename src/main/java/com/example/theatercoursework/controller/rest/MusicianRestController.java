package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Musician;
import com.example.theatercoursework.service.musician.impls.MusicianServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/musicians")
public class MusicianRestController {
    @Autowired
    MusicianServiceImpl service;

    @GetMapping
    public List<Musician> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Musician getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Musician delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Musician create(@RequestBody Musician musician){
        return service.create(musician);
    }

    @PostMapping("/edit/{id}")
    public Musician update(@PathVariable String id,
                           @RequestBody Musician musician){
        musician.setId(service.getById(id).getId());
        musician.setCreated_at(service.getById(id).getCreated_at());
        return service.update(musician);
    }


}
