package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Musician;
import com.example.theatercoursework.service.musician.impls.MusicianServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Musician's controller", description = "Управління даними про музиканта")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/musicians")
public class MusicianRestController {
    @Autowired
    MusicianServiceImpl service;

    @Operation(
            summary = "Вивід музикантів",
            description = "Виводить всю інформацію про всіх існуючих музикантів"
    )
    @GetMapping
    public List<Musician> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід музиканта по id",
            description = "Виводить всю інформацію про заданого музиканта"
    )
    @GetMapping("/get/{id}")
    public Musician getById(
            @PathVariable("id")
            @Parameter(description = "ID музиканта")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення музиканта по id",
            description = "Видаляє заданого музиканта"
    )
    @GetMapping("/delete/{id}")
    public Musician delete(
            @PathVariable("id")
            @Parameter(description = "ID музиканта")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового музиканта",
            description = "Створює нового музиканта"
    )
    @PostMapping("/create")
    public Musician create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового музиканта")
                    Musician musician) {
        return service.create(musician);
    }

    @Operation(
            summary = "Редагування музиканта",
            description = "Шукає музиканта по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Musician update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого музиканта")
            @RequestBody
                    Musician musician) {
        musician.setId(service.getById(id).getId());
        musician.setCreated_at(service.getById(id).getCreated_at());
        return service.update(musician);
    }


}
