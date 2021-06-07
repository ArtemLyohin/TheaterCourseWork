package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Spectacle;
import com.example.theatercoursework.service.spectacle.impls.SpectacleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/spectacles")
public class SpectacleRestController {
    @Autowired
    SpectacleServiceImpl service;

    @GetMapping
    public List<Spectacle> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Spectacle getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Spectacle delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Spectacle create(@RequestBody Spectacle spectacle){
        return service.create(spectacle);
    }

    @PostMapping("/edit/{id}")
    public Spectacle update(@PathVariable String id,
                       @RequestBody Spectacle spectacle){
        spectacle.setId(service.getById(id).getId());
        spectacle.setCreated_at(service.getById(id).getCreated_at());
        return service.update(spectacle);
    }


}
