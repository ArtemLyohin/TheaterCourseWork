package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Servant;
import com.example.theatercoursework.service.servant.impls.ServantServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/servants")
public class ServantRestController {
    @Autowired
    ServantServiceImpl service;

    @GetMapping
    public List<Servant> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Servant getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Servant delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Servant create(@RequestBody Servant servant){
        return service.create(servant);
    }

    @PostMapping("/edit/{id}")
    public Servant update(@PathVariable String id,
                           @RequestBody Servant servant){
        servant.setId(service.getById(id).getId());
        servant.setCreated_at(service.getById(id).getCreated_at());
        return service.update(servant);
    }


}
