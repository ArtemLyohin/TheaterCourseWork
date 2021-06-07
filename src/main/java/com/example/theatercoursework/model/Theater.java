package com.example.theatercoursework.model;

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
public class Theater {
    @Id
    @EqualsAndHashCode.Include()
    private String id;
    private String city;
    private String address;
    private String description;
    private LocalDateTime created_at;
    private LocalDateTime modified_at;
}
