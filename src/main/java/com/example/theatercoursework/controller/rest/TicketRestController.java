package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Ticket;
import com.example.theatercoursework.service.ticket.impls.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/tickets")
public class TicketRestController {
    @Autowired
    TicketServiceImpl service;

    @GetMapping
    public List<Ticket> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Ticket getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Ticket delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Ticket create(@RequestBody Ticket ticket){
        return service.create(ticket);
    }

    @PostMapping("/edit/{id}")
    public Ticket update(@PathVariable String id,
                            @RequestBody Ticket ticket){
        ticket.setId(service.getById(id).getId());
        ticket.setCreated_at(service.getById(id).getCreated_at());
        return service.update(ticket);
    }
}
