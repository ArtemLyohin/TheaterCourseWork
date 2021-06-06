package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Hall;
import com.example.theatercoursework.service.hall.impls.HallServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/halls")
public class HallRestController {
    @Autowired
    HallServiceImpl service;

    @GetMapping
    public List<Hall> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Hall getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Hall delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Hall create(@RequestBody Hall hall){
        return service.create(hall);
    }

    @PostMapping("/edit/{id}")
    public Hall update(@PathVariable String id,
                           @RequestBody Hall hall){
        hall.setId(service.getById(id).getId());
        hall.setCreated_at(service.getById(id).getCreated_at());
        return service.update(hall);
    }


}
