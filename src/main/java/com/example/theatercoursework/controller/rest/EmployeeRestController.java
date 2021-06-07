package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Employee;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Tag(name = "Employee's controller", description = "Управління даними про працівника")
@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
    @Autowired
    EmployeeServiceImpl service;

    @Operation(
            summary = "Вивід працівників",
            description = "Виводить всю інформацію про всіх існуючих працівників"
    )
    @GetMapping
    public List<Employee> getAll() {
        return service.getAll();
    }

    @Operation(
            summary = "Вивід працівника по id",
            description = "Виводить всю інформацію про заданого працівника"
    )
    @GetMapping("/get/{id}")
    public Employee getById(
            @PathVariable("id")
            @Parameter(description = "ID працівника")
                    String id) {
        return service.getById(id);
    }

    @Operation(
            summary = "Видалення працівника по id",
            description = "Видаляє заданого працівника"
    )
    @GetMapping("/delete/{id}")
    public Employee delete(
            @PathVariable("id")
            @Parameter(description = "ID працівника")
                    String id) {
        return service.delete(service.getById(id));
    }

    @Operation(
            summary = "Створення нового працівника",
            description = "Створює нового працівника"
    )
    @PostMapping("/create")
    public Employee create(
            @RequestBody
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані нового працівника")
                    Employee employee) {
        return service.create(employee);
    }

    @Operation(
            summary = "Редагування працівника",
            description = "Шукає працівника по id та надає йому оновлену інформацію"
    )
    @PostMapping("/edit/{id}")
    public Employee update(
            @PathVariable
                    String id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Дані зміненого працівника")
            @RequestBody
                    Employee employee) {
        employee.setId(service.getById(id).getId());
        employee.setCreated_at(service.getById(id).getCreated_at());
        return service.update(employee);
    }


}
