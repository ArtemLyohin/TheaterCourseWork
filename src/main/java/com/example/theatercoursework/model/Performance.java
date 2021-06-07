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
    @Schema(description = "Спектакль")
    private Spectacle spectacle;
    @Schema(description = "Вид виступу", allowableValues = "PREMIERE, USUAL", example = "PREMIERE/USUAL")
    private PerformanceType performanceType;
    @Schema(description = "Дата та час вистави", example = "2021-06-10T13:30:00.410Z")
    private LocalDateTime dateAndTime;
    @Schema(description = "Зал, у якому буде виступ")
    private Hall hall;
    @Schema(description = "Опис")
    private String description;
    @Schema(description = "Дата створення об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime created_at;
    @Schema(description = "Дата останньої модифікації об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime modified_at;
}
