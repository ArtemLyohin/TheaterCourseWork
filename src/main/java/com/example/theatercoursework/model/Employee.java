package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Sex;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document
public class Employee {
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    private String name;
    private Sex sex;
    private LocalDate birthDate;
    EmployeeType employeeType;
    private int salary;
    private LocalDate employmentDate;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
