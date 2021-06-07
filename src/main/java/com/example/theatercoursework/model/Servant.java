package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.ServantType;
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
public class Servant extends Employee{
    @Schema(description = "Тип службовця", allowableValues = "GUARD, CLEANER, CASHIER", example = "GUARD/CLEANER/CASHIER")
    private ServantType servantType;
    public Servant(String id, String name, Sex sex, LocalDate birthDate,
                   Theater theater, EmployeeType employeeType, int salary, LocalDate employmentDate,
                   String description, LocalDateTime created_at, LocalDateTime modified_at,
                   ServantType servantType) {
        super(id, name, sex, birthDate, theater, employeeType, salary, employmentDate, description, created_at,
              modified_at);
        this.servantType = servantType;
    }
}
