package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.Genre;
import com.example.theatercoursework.model.enums.TargetAudience;
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
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Document
public class Spectacle {
    @Schema(description = "ID спектаклю", accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    private String name;
    private Genre genre;
    private TargetAudience targetAudience;
    private List<Actor> mainRoles;
    private List<Actor> understudies;
    private List<Actor> secondaryRoles;
    private Producer director;
    private Producer artist;
    private Producer conductor;
    private Producer author;
    private Integer priceForUsual;
    private Integer duration;
    @Schema(description = "Опис")
    private String description;
    @Schema(description = "Дата створення об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime created_at;
    @Schema(description = "Дата останньої модифікації об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime modified_at;
}
