package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Hall;
import com.example.theatercoursework.service.hall.impls.HallServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Hall's controller", description = "Управління даними про залу")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/halls")
public class HallRestController {
    @Autowired
    HallServiceImpl service;

    @Operation(
            summary = "Вивід залів",
            description = "Виводить всю інформацію про всіх існуючих залів"
    )
    @GetMapping
    public List<Hall> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід залу по id",
            description = "Виводить всю інформацію про заданого залу"
    )
    @GetMapping("/get/{id}")
    public Hall getById(
            @PathVariable("id")
            @Parameter(description = "ID залу")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення залу по id",
            description = "Видаляє заданого залу"
    )
    @GetMapping("/delete/{id}")
    public Hall delete(
            @PathVariable("id")
            @Parameter(description = "ID залу")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового залу",
            description = "Створює нового залу"
    )
    @PostMapping("/create")
    public Hall create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового залу")
                    Hall hall) {
        return service.create(hall);
    }

    @Operation(
            summary = "Редагування залу",
            description = "Шукає залу по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Hall update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого залу")
            @RequestBody
                    Hall hall) {
        hall.setId(service.getById(id).getId());
        hall.setCreated_at(service.getById(id).getCreated_at());
        return service.update(hall);
    }


}
