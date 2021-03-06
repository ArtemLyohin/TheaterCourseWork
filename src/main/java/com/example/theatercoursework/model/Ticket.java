package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.PlaceType;
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
public class Ticket {
    @Schema(description = "ID квитка", accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    @Schema(description = "Виступ")
    private Performance performance;
    @Schema(description = "Тип місця", allowableValues = "USUAL, BALCONY, VIP", example = "USUAL/BALCONY/VIP")
    private PlaceType placeType;
    @Schema(description = "Ціна за квиток",accessMode = Schema.AccessMode.READ_ONLY)
    private Double price;
    @Schema(description = "Опис")
    private String description;
    @Schema(description = "Дата створення об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime created_at;
    @Schema(description = "Дата останньої модифікації об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime modified_at;
}
