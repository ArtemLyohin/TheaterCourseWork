package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Ticket;
import com.example.theatercoursework.service.ticket.impls.TicketServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Ticket's controller", description = "Управління даними про квитки")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/tickets")
public class TicketRestController {
    @Autowired
    TicketServiceImpl service;

    @Operation(
            summary = "Вивід квитків",
            description = "Виводить всю інформацію про всіх існуючих квитків"
    )
    @GetMapping
    public List<Ticket> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід квитка по id",
            description = "Виводить всю інформацію заданого квитка"
    )
    @GetMapping("/get/{id}")
    public Ticket getById(
            @PathVariable("id")
            @Parameter(description = "ID квитка")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення квитка по id",
            description = "Видаляє заданого квитка"
    )
    @GetMapping("/delete/{id}")
    public Ticket delete(
            @PathVariable("id")
            @Parameter(description = "ID квитка")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового квитка",
            description = "Створює нового квитка"
    )
    @PostMapping("/create")
    public Ticket create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового квитка")
                    Ticket ticket) {
        return service.create(ticket);
    }

    @Operation(
            summary = "Редагування квитка",
            description = "Шукає квитка по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Ticket update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого квитка")
            @RequestBody
                    Ticket ticket) {
        ticket.setId(service.getById(id).getId());
        ticket.setCreated_at(service.getById(id).getCreated_at());
        return service.update(ticket);
    }
}
