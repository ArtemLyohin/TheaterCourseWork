package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Producer;
import com.example.theatercoursework.service.producer.impls.ProducerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/producers")
public class ProducerRestController {
    @Autowired
    ProducerServiceImpl service;

    @GetMapping
    public List<Producer> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Producer getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Producer delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Producer create(@RequestBody Producer producer){
        return service.create(producer);
    }

    @PostMapping("/edit/{id}")
    public Producer update(@PathVariable String id,
                          @RequestBody Producer producer){
        producer.setId(service.getById(id).getId());
        producer.setCreated_at(service.getById(id).getCreated_at());
        return service.update(producer);
    }


}
