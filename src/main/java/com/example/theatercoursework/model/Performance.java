package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.PerformanceType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document
public class Performance {
    @Schema(description = "ID виступу", accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    private Spectacle spectacle;
    private PerformanceType performanceType;
    private LocalDateTime dateAndTime;
    private Hall hall;
    @Schema(description = "Опис")
    private String description;
    @Schema(description = "Дата створення об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime created_at;
    @Schema(description = "Дата останньої модифікації об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime modified_at;
}
