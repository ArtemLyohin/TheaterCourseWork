package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Producer;
import com.example.theatercoursework.model.Touring;
import com.example.theatercoursework.service.touring.impls.TouringServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


@Tag(name = "Touring's controller", description = "Управління даними про гастролі")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/tourings")
public class TouringRestController {
    @Autowired
    TouringServiceImpl service;

    @Operation(
            summary = "Вивід гастролей",
            description = "Виводить всю інформацію про всіх існуючих гастролей"
    )
    @GetMapping
    public List<Touring> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід гастролі по id",
            description = "Виводить всю інформацію про заданого гастролі"
    )
    @GetMapping("/get/{id}")
    public Touring getById(
            @PathVariable("id")
            @Parameter(description = "ID гастролі")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення гастролі по id",
            description = "Видаляє заданого гастролі"
    )
    @GetMapping("/delete/{id}")
    public Touring delete(
            @PathVariable("id")
            @Parameter(description = "ID гастролі")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового гастролі",
            description = "Створює нового гастролі"
    )
    @PostMapping("/create")
    public Touring create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового гастролі")
                    Touring touring) {
        return service.create(touring);
    }

    @Operation(
            summary = "Редагування гастролі",
            description = "Шукає гастролі по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Touring update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого гастролі")
            @RequestBody
                    Touring touring) {
        touring.setId(service.getById(id).getId());
        touring.setCreated_at(service.getById(id).getCreated_at());
        return service.update(touring);
    }
}
