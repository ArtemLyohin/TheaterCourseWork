package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Director;
import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Sex;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeDirector {
    private List<Director> directors = new ArrayList<>(Arrays.asList(
            new Director(null, "Бірюк Віктор Олегович", Sex.MALE,
                         LocalDate.parse("1973-10-09"), EmployeeType.DIRECTOR,
                         29000, LocalDate.parse("2009-10-11"), "",
                         LocalDateTime.now(), LocalDateTime.now())
                                                                    ));

    public List<Director> getDirectors() {
        return directors;
    }

    public void setDirectors(List<Director> directors) {
        this.directors = directors;
    }
}
