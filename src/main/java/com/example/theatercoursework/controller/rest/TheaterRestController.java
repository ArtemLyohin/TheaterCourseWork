package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Theater;
import com.example.theatercoursework.service.theater.impls.TheaterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/theaters")
public class TheaterRestController {
    @Autowired
    TheaterServiceImpl service;

    @GetMapping
    public List<Theater> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Theater getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Theater delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Theater create(@RequestBody Theater theater){
        return service.create(theater);
    }

    @PostMapping("/edit/{id}")
    public Theater update(@PathVariable String id,
                            @RequestBody Theater theater){
        theater.setId(service.getById(id).getId());
        theater.setCreated_at(service.getById(id).getCreated_at());
        return service.update(theater);
    }


}
