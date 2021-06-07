package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Performance;
import com.example.theatercoursework.service.performance.impls.PerformanceServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Performance's controller", description = "Управління даними про виступу")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/performances")
public class PerformanceRestController {
    @Autowired
    PerformanceServiceImpl service;

    @Operation(
            summary = "Вивід виступів",
            description = "Виводить всю інформацію про всіх існуючих виступів"
    )
    @GetMapping
    public List<Performance> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід виступу по id",
            description = "Виводить всю інформацію про заданого виступу"
    )
    @GetMapping("/get/{id}")
    public Performance getById(
            @PathVariable("id")
            @Parameter(description = "ID виступу")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення виступу по id",
            description = "Видаляє заданого виступу"
    )
    @GetMapping("/delete/{id}")
    public Performance delete(
            @PathVariable("id")
            @Parameter(description = "ID виступу")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового виступу",
            description = "Створює нового виступу"
    )
    @PostMapping("/create")
    public Performance create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового виступу")
                    Performance performance) {
        return service.create(performance);
    }

    @Operation(
            summary = "Редагування виступу",
            description = "Шукає виступу по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Performance update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого виступу")
            @RequestBody
                    Performance performance) {
        performance.setId(service.getById(id).getId());
        performance.setCreated_at(service.getById(id).getCreated_at());
        return service.update(performance);
    }


}
