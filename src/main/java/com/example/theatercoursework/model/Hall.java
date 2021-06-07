package com.example.theatercoursework.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document
public class Hall {
   @Schema(description = "ID залу", accessMode = Schema.AccessMode.READ_ONLY)
   @Id
   @EqualsAndHashCode.Include()
   private String id;
   @Schema(description = "Театр")
   private Theater theater;
   @Schema(description = "Кількість звичайних місць", example = "70")
   private Integer usual;
   @Schema(description = "Кількість VIP місць", example = "20")
   private Integer vip;
   @Schema(description = "Кількість місць на балконі", example = "30")
   private Integer balcony;
   @Schema(description = "Опис")
   private String description;
   @Schema(description = "Дата створення об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
   private LocalDateTime created_at;
   @Schema(description = "Дата останньої модифікації об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
   private LocalDateTime modified_at;
}
