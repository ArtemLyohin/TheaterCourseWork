package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Servant;
import com.example.theatercoursework.service.servant.impls.ServantServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Servant's controller", description = "Управління даними про службовця")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/servants")
public class ServantRestController {
    @Autowired
    ServantServiceImpl service;

    @Operation(
            summary = "Вивід службовців",
            description = "Виводить всю інформацію про всіх існуючих службовців"
    )
    @GetMapping
    public List<Servant> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід службовця по id",
            description = "Виводить всю інформацію про заданого службовця"
    )
    @GetMapping("/get/{id}")
    public Servant getById(
            @PathVariable("id")
            @Parameter(description = "ID службовця")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення службовця по id",
            description = "Видаляє заданого службовця"
    )
    @GetMapping("/delete/{id}")
    public Servant delete(
            @PathVariable("id")
            @Parameter(description = "ID службовця")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового службовця",
            description = "Створює нового службовця"
    )
    @PostMapping("/create")
    public Servant create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового службовця")
                    Servant servant) {
        return service.create(servant);
    }

    @Operation(
            summary = "Редагування службовця",
            description = "Шукає службовця по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Servant update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого службовця")
            @RequestBody
                    Servant servant) {
        servant.setId(service.getById(id).getId());
        servant.setCreated_at(service.getById(id).getCreated_at());
        return service.update(servant);
    }


}
