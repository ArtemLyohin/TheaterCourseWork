package com.example.theatercoursework.model;

import com.example.theatercoursework.model.enums.PlaceType;
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
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    private Performance performance;
    private PlaceType placeType;
    private Double price;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
