package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.ProducerType;
import com.example.theatercoursework.model.enums.Sex;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalDateTime;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Producer extends Employee {
    private ProducerType producerType;

    public Producer(String id, String name, Sex sex,
                    LocalDate birthDate, EmployeeType employeeType,
                    int salary, LocalDate employmentDate, String description, LocalDateTime created_at,
                    LocalDateTime modified_at,
                    ProducerType producerType) {
        super(id, name, sex, birthDate, employeeType, salary, employmentDate, description, created_at, modified_at);
        this.producerType = producerType;
    }
}
