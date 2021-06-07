package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.ProducerType;
import com.example.theatercoursework.model.enums.Sex;
import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "Тип постановника", allowableValues ="DIRECTOR, ARTIST, CONDUCTOR, AUTHOR", example = " DIRECTOR/ARTIST/CONDUCTOR/AUTHOR")
    private ProducerType producerType;

    public Producer(String id, String name, Sex sex, LocalDate birthDate,
                    Theater theater, EmployeeType employeeType, int salary, LocalDate employmentDate,
                    String description, LocalDateTime created_at, LocalDateTime modified_at,
                    ProducerType producerType) {
        super(id, name, sex, birthDate, theater, employeeType, salary, employmentDate, description, created_at,
              modified_at);
        this.producerType = producerType;
    }
}
