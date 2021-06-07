package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Theater;
import com.example.theatercoursework.service.theater.impls.TheaterServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Theater's controller", description = "Управління даними про театру")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/theaters")
public class TheaterRestController {
    @Autowired
    TheaterServiceImpl service;

    @Operation(
            summary = "Вивід театрів",
            description = "Виводить всю інформацію про всіх існуючих театрів"
    )
    @GetMapping
    public List<Theater> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід театру по id",
            description = "Виводить всю інформацію про заданого театру"
    )
    @GetMapping("/get/{id}")
    public Theater getById(
            @PathVariable("id")
            @Parameter(description = "ID театру")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення театру по id",
            description = "Видаляє заданого театру"
    )
    @GetMapping("/delete/{id}")
    public Theater delete(
            @PathVariable("id")
            @Parameter(description = "ID театру")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового театру",
            description = "Створює нового театру"
    )
    @PostMapping("/create")
    public Theater create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового театру")
                    Theater theater) {
        return service.create(theater);
    }

    @Operation(
            summary = "Редагування театру",
            description = "Шукає театру по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Theater update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого театру")
            @RequestBody
                    Theater theater) {
        theater.setId(service.getById(id).getId());
        theater.setCreated_at(service.getById(id).getCreated_at());
        return service.update(theater);
    }
}
