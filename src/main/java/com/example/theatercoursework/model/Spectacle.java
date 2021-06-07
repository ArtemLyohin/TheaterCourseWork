package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.Genre;
import com.example.theatercoursework.model.enums.TargetAudience;
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
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    private Genre genre;
    private TargetAudience targetAudience;
    private Hall hall;
    private List<Actor> mainRoles;
    private List<Actor> understudies;
    private List<Actor> secondaryRoles;
    private Producer director;
    private Producer artist;
    private Producer conductor;
    private Producer author;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
