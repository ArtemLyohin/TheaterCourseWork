package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.PerformanceType;
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
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    private Spectacle spectacle;
    private PerformanceType performanceType;
    private LocalDateTime dateAndTime;
    private Hall hall;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
