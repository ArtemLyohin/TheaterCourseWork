package com.example.theatercoursework.model;

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
   @Id
   @EqualsAndHashCode.Include()
   private String id;
   private Integer usual;
   private Integer vip;
   private Integer balcony;
   private String description;
   private LocalDateTime created_at;
   private LocalDateTime modified_at;
}
