package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Sex;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Director extends Employee{
    public Director(String id, String name, Sex sex,
                    LocalDate birthDate, EmployeeType employeeType,
                    int salary, LocalDate employmentDate, String description, LocalDateTime created_at,
                    LocalDateTime modified_at) {
        super(id, name, sex, birthDate, employeeType, salary, employmentDate, description, created_at, modified_at);
    }
}
