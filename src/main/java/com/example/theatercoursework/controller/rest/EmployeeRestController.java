package com.example.theatercoursework.controller.rest;

import com.example.theatercoursework.model.Employee;
import com.example.theatercoursework.service.employee.impls.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
    @Autowired
    EmployeeServiceImpl service;

    @GetMapping
    public List<Employee> getAll(){
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    public Employee getById(@PathVariable("id") String id){
        return service.getById(id);
    }

    @GetMapping("/delete/{id}")
    public Employee delete(@PathVariable("id")  String id){
        return service.delete(service.getById(id));
    }

    @PostMapping("/create")
    public Employee create(@RequestBody Employee employee){
        return service.create(employee);
    }

    @PostMapping("/edit/{id}")
    public Employee update(@PathVariable String id,
                           @RequestBody Employee employee){
        employee.setId(service.getById(id).getId());
        employee.setCreated_at(service.getById(id).getCreated_at());
        return service.update(employee);
    }


}
