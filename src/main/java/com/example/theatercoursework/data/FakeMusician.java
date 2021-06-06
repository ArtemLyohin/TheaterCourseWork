package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Musician;
import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Sex;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeMusician {
    private List<Musician> musicians = new ArrayList<>(Arrays.asList(
            new Musician(null, "Петренко Віталій Назарович", Sex.MALE,
                         LocalDate.parse("1987-06-18"), EmployeeType.MUSICIAN,
                         14000, LocalDate.parse("2019-03-12"), "",
                         LocalDateTime.now(), LocalDateTime.now(), "Гітара"),
            new Musician(null, "Петренко Захар Назарович", Sex.MALE,
                         LocalDate.parse("1990-09-11"), EmployeeType.MUSICIAN,
                         14000, LocalDate.parse("2019-03-12"), "",
                         LocalDateTime.now(), LocalDateTime.now(), "Фортепіано"),
            new Musician(null, "Іваненко Віолетта Георгіївна", Sex.FEMALE,
                         LocalDate.parse("1995-06-14"), EmployeeType.MUSICIAN,
                         11000, LocalDate.parse("2020-01-29"), "",
                         LocalDateTime.now(), LocalDateTime.now(), "Фортепіано"),
            new Musician(null, "Броняк Олександр Віталійович", Sex.MALE,
                         LocalDate.parse("1982-12-14"), EmployeeType.MUSICIAN,
                         10000, LocalDate.parse("2021-04-12"), "",
                         LocalDateTime.now(), LocalDateTime.now(), "Скрипка"),
            new Musician(null, "Никоряк Ігор Артурович", Sex.MALE,
                         LocalDate.parse("2000-07-28"), EmployeeType.MUSICIAN,
                         12000, LocalDate.parse("2019-03-12"), "",
                         LocalDateTime.now(), LocalDateTime.now(), "Гітара")
                                                                    ));
    public List<Musician> getMusicians() {
        return musicians;
    }

    public void setMusicians(List<Musician> musicians) {
        this.musicians = musicians;
    }

}
