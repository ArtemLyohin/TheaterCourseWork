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
    @Schema(description = "ID спектакля", accessMode = Schema.AccessMode.READ_ONLY)
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    @Schema(description = "Назва спектакля", example = "Семеро гномів")
    private String name;
    @Schema(description = "Жанр",
            allowableValues = "COMEDY, MUSICAL, TRAGEDY, OPERETTA, TRAGICOMEDY, DRAMA, MELODRAMA",
            example = "COMEDY/MUSICAL/TRAGEDY/OPERETTA/TRAGICOMEDY/DRAMA/MELODRAMA")
    private Genre genre;
    @Schema(description = "Цільова аудиторія",
            allowableValues = "CHILDREN, TEENAGERS, MIDDLE_AGED, ELDERLY",
            example = "CHILDREN/TEENAGERS/MIDDLE_AGED/ELDERLY")
    private TargetAudience targetAudience;
    @Schema(description = "Актори головних ролей")
    private List<Actor> mainRoles;
    @Schema(description = "Дублери головних ролей")
    private List<Actor> understudies;
    @Schema(description = "Актори другорядних ролей")
    private List<Actor> secondaryRoles;
    @Schema(description = "Музиканти")
    private List<Musician> musicians;
    @Schema(description = "Режисер-постановник")
    private Producer director;
    @Schema(description = "Художник-постановник")
    private Producer artist;
    @Schema(description = "Диригент-постановник")
    private Producer conductor;
    @Schema(description = "Автор")
    private Producer author;
    @Schema(description = "Ціна за звичайне місце")
    private Integer priceForUsual;
    @Schema(description = "Тривалість спектаклю")
    private Integer duration;
    @Schema(description = "Опис")
    private String description;
    @Schema(description = "Дата створення об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime created_at;
    @Schema(description = "Дата останньої модифікації об'єтку",accessMode = Schema.AccessMode.READ_ONLY)
    private LocalDateTime modified_at;
}
