package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Sex;
import com.example.theatercoursework.model.enums.Voice;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Actor extends Employee {
    private int height;
    private Voice voice;

    public Actor(String id, String name, Sex sex, LocalDate birthDate, Theater theater,
                 EmployeeType employeeType, int salary, LocalDate employmentDate, String description,
                 LocalDateTime created_at, LocalDateTime modified_at, int height,
                 Voice voice) {
        super(id, name, sex, birthDate, theater, employeeType, salary, employmentDate, description, created_at,
              modified_at);
        this.height = height;
        this.voice = voice;
    }
}
