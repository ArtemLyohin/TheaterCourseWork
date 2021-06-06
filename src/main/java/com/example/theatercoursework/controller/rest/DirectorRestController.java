package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Director;
import com.example.theatercoursework.service.director.impls.DirectorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/directors")
public class DirectorRestController {
    @Autowired
    DirectorServiceImpl service;

    @GetMapping
    public List<Director> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Director getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Director delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Director create(@RequestBody Director director){
        return service.create(director);
    }

    @PostMapping("/edit/{id}")
    public Director update(@PathVariable String id,
                        @RequestBody Director director){
        director.setId(service.getById(id).getId());
        director.setCreated_at(service.getById(id).getCreated_at());
        return service.update(director);
    }


}
