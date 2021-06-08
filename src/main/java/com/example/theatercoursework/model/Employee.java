package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Sex;
import io.swagger.v3.oas.annotations.media.Schema;
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
    @Schema(description = "ID працівника", accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    @Schema(description = "ПІП працівника", example="Степанчук Степан Степанович")
    private String name;
    @Schema(description = "Стать (MALE,FEMALE,OTHER)", allowableValues = "MALE,FEMALE,OTHER", example="MALE/FEMALE/OTHER")
    private Sex sex;
    @Schema(description = "Дата народження", example="1990-01-01")
    private LocalDate birthDate;
    @Schema(description = "Театр в якому працює")
    private Theater theater;
    @Schema(description = "Тип працівника", allowableValues="PRODUCER,ACTOR,MUSICIAN,SERVANT,DIRECTOR", example = "PRODUCER/ACTOR/MUSICIAN/SERVANT/DIRECTOR")
    private EmployeeType employeeType;
    @Schema(description = "Зарплата", example = "13000")
    private int salary;
    @Schema(description = "Дата працевлаштування", example="2017-05-12")
    private LocalDate employmentDate;
    @Schema(description = "Опис")
    private String description;
    @Schema(description = "Дата створення об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime created_at;
    @Schema(description = "Дата останньої модифікації об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime modified_at;
}
