package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Performance;
import com.example.theatercoursework.service.performance.impls.PerformanceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/performances")
public class PerformanceRestController {
    @Autowired
    PerformanceServiceImpl service;

    @GetMapping
    public List<Performance> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Performance getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Performance delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Performance create(@RequestBody Performance performance){
        return service.create(performance);
    }

    @PostMapping("/edit/{id}")
    public Performance update(@PathVariable String id,
                            @RequestBody Performance performance){
        performance.setId(service.getById(id).getId());
        performance.setCreated_at(service.getById(id).getCreated_at());
        return service.update(performance);
    }
}
