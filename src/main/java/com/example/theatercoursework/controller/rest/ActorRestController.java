package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Actor;
import com.example.theatercoursework.service.actor.impls.ActorServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Actor's controller", description = "Управління даними про акторів")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/actors")
public class ActorRestController {
    @Autowired
    ActorServiceImpl service;

    @Operation(
            summary = "Вивід акторів",
            description = "Виводить всю інформацію про всіх існуючих акторів"
    )
    @GetMapping
    public List<Actor> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід актора по id",
            description = "Виводить всю інформацію про заданого актора"
    )
    @GetMapping("/get/{id}")
    public Actor getById(
            @PathVariable("id")
            @Parameter(description = "ID актора")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення актора по id",
            description = "Видаляє заданого актора"
    )
    @GetMapping("/delete/{id}")
    public Actor delete(
            @PathVariable("id")
            @Parameter(description = "ID актора")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового актора",
            description = "Створює нового актора"
    )
    @PostMapping("/create")
    public Actor create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового актора")
                    Actor actor) {
        return service.create(actor);
    }

    @Operation(
            summary = "Редагування актора",
            description = "Шукає актора по id та надає їй оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Actor update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого актора")
            @RequestBody
                    Actor actor) {
        actor.setId(service.getById(id).getId());
        actor.setCreated_at(service.getById(id).getCreated_at());
        return service.update(actor);
    }


}
