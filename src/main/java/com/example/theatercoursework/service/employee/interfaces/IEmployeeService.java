package com.example.theatercoursework.service.employee.interfaces;

import com.example.theatercoursework.model.Employee;

import java.util.List;

public interface IEmployeeService {
    Employee create(Employee employee);
    Employee update(Employee employee);
    Employee delete(Employee employee);
    Employee getById(String id);
    List<Employee> getAll();
}
