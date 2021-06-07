package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Producer;
import com.example.theatercoursework.service.producer.impls.ProducerServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Producer's controller", description = "Управління даними про постановника")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/producers")
public class ProducerRestController {
    @Autowired
    ProducerServiceImpl service;

    @Operation(
            summary = "Вивід постановників",
            description = "Виводить всю інформацію про всіх існуючих постановників"
    )
    @GetMapping
    public List<Producer> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід постановника по id",
            description = "Виводить всю інформацію про заданого постановника"
    )
    @GetMapping("/get/{id}")
    public Producer getById(
            @PathVariable("id")
            @Parameter(description = "ID постановника")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення постановника по id",
            description = "Видаляє заданого постановника"
    )
    @GetMapping("/delete/{id}")
    public Producer delete(
            @PathVariable("id")
            @Parameter(description = "ID постановника")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового постановника",
            description = "Створює нового постановника"
    )
    @PostMapping("/create")
    public Producer create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового постановника")
                    Producer producer) {
        return service.create(producer);
    }

    @Operation(
            summary = "Редагування постановника",
            description = "Шукає постановника по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Producer update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого постановника")
            @RequestBody
                    Producer producer) {
        producer.setId(service.getById(id).getId());
        producer.setCreated_at(service.getById(id).getCreated_at());
        return service.update(producer);
    }


}
