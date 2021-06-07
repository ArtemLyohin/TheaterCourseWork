package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Touring;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeTouring {
    private List<Touring> tourings = new ArrayList<>(Arrays.asList(
            Touring.builder()
                   .id(null)
                   .city("Київ")
                   .address("Гоголя 17")
                   .spectacle(null)
                   .dateAndTime(LocalDateTime.parse("2021-06-15 12:30",
                                                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                   .description("")
                   .created_at(LocalDateTime.now())
                   .modified_at(LocalDateTime.now())
                   .build(),
            Touring.builder()
                   .id(null)
                   .city("Київ")
                   .address("Гоголя 17")
                   .spectacle(null)
                   .dateAndTime(LocalDateTime.parse("2021-06-15 15:30",
                                                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                   .description("")
                   .created_at(LocalDateTime.now())
                   .modified_at(LocalDateTime.now())
                   .build(),
            Touring.builder()
                   .id(null)
                   .city("Київ")
                   .address("Гоголя 17")
                   .spectacle(null)
                   .dateAndTime(LocalDateTime.parse("2021-06-15 19:30",
                                                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                   .description("")
                   .created_at(LocalDateTime.now())
                   .modified_at(LocalDateTime.now())
                   .build(),
            Touring.builder()
                   .id(null)
                   .city("Київ")
                   .address("Гоголя 17")
                   .spectacle(null)
                   .dateAndTime(LocalDateTime.parse("2021-06-16 14:30",
                                                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                   .description("")
                   .created_at(LocalDateTime.now())
                   .modified_at(LocalDateTime.now())
                   .build(),
            Touring.builder()
                   .id(null)
                   .city("Київ")
                   .address("Гоголя 17")
                   .spectacle(null)
                   .dateAndTime(LocalDateTime.parse("2021-06-16 19:30",
                                                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                   .description("")
                   .created_at(LocalDateTime.now())
                   .modified_at(LocalDateTime.now())
                   .build()
                                                                  ));

    public List<Touring> getTourings() {
        return tourings;
    }

    public void setTourings(List<Touring> tourings) {
        this.tourings = tourings;
    }
}
