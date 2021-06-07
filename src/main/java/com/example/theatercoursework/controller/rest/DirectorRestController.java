package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Director;
import com.example.theatercoursework.service.director.impls.DirectorServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Director's controller", description = "Управління даними про директора")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/directors")
public class DirectorRestController {
    @Autowired
    DirectorServiceImpl service;

    @Operation(
            summary = "Вивід директорів",
            description = "Виводить всю інформацію про всіх існуючих директорів"
    )
    @GetMapping
    public List<Director> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід директора по id",
            description = "Виводить всю інформацію про заданого директора"
    )
    @GetMapping("/get/{id}")
    public Director getById(
            @PathVariable("id")
            @Parameter(description = "ID директора")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення директора по id",
            description = "Видаляє заданого директора"
    )
    @GetMapping("/delete/{id}")
    public Director delete(
            @PathVariable("id")
            @Parameter(description = "ID директора")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового директора",
            description = "Створює нового директора"
    )
    @PostMapping("/create")
    public Director create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового директора")
                    Director director) {
        return service.create(director);
    }

    @Operation(
            summary = "Редагування директора",
            description = "Шукає директора по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Director update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого директора")
            @RequestBody
                    Director director) {
        director.setId(service.getById(id).getId());
        director.setCreated_at(service.getById(id).getCreated_at());
        return service.update(director);
    }


}
