package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Spectacle;
import com.example.theatercoursework.service.spectacle.impls.SpectacleServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Spectacle's controller", description = "Управління даними про спектаклю")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/spectacles")
public class SpectacleRestController {
    @Autowired
    SpectacleServiceImpl service;

    @Operation(
            summary = "Вивід спектаклів",
            description = "Виводить всю інформацію про всіх існуючих спектаклів"
    )
    @GetMapping
    public List<Spectacle> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід спектаклю по id",
            description = "Виводить всю інформацію про заданого спектаклю"
    )
    @GetMapping("/get/{id}")
    public Spectacle getById(
            @PathVariable("id")
            @Parameter(description = "ID спектаклю")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення спектаклю по id",
            description = "Видаляє заданого спектаклю"
    )
    @GetMapping("/delete/{id}")
    public Spectacle delete(
            @PathVariable("id")
            @Parameter(description = "ID спектаклю")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового спектаклю",
            description = "Створює нового спектаклю"
    )
    @PostMapping("/create")
    public Spectacle create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового спектаклю")
                    Spectacle spectacle) {
        return service.create(spectacle);
    }

    @Operation(
            summary = "Редагування спектаклю",
            description = "Шукає спектаклю по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Spectacle update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого спектаклю")
            @RequestBody
                    Spectacle spectacle) {
        spectacle.setId(service.getById(id).getId());
        spectacle.setCreated_at(service.getById(id).getCreated_at());
        return service.update(spectacle);
    }
}
