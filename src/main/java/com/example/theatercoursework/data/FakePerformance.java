package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Performance;
import com.example.theatercoursework.model.enums.PerformanceType;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakePerformance {
    private List<Performance> performances = new ArrayList<>(Arrays.asList(
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.PREMIERE)
                       .dateAndTime(LocalDateTime.parse("2021-06-09 12:30",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.PREMIERE)
                       .dateAndTime(LocalDateTime.parse("2021-06-09 14:30",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.PREMIERE)
                       .dateAndTime(LocalDateTime.parse("2021-06-10 17:30",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.PREMIERE)
                       .dateAndTime(LocalDateTime.parse("2021-06-10 20:30",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.PREMIERE)
                       .dateAndTime(LocalDateTime.parse("2021-06-11 15:00",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.USUAL)
                       .dateAndTime(LocalDateTime.parse("2021-06-12 14:30",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.USUAL)
                       .dateAndTime(LocalDateTime.parse("2021-06-12 19:00",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.USUAL)
                       .dateAndTime(LocalDateTime.parse("2021-06-13 20:00",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.USUAL)
                       .dateAndTime(LocalDateTime.parse("2021-06-14 16:00",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build(),
            Performance.builder()
                       .id(null)
                       .spectacle(null)
                       .performanceType(PerformanceType.USUAL)
                       .dateAndTime(LocalDateTime.parse("2021-06-14 19:00",
                                                        DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")))
                       .hall(null)
                       .description("")
                       .created_at(LocalDateTime.now())
                       .modified_at(LocalDateTime.now())
                       .build()
                                                                          ));

    public List<Performance> getPerformances() {
        return performances;
    }

    public void setPerformances(List<Performance> performances) {
        this.performances = performances;
    }
}
