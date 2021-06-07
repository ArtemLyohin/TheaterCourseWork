package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Actor;
import com.example.theatercoursework.model.enums.EmployeeType;
import com.example.theatercoursework.model.enums.Sex;
import com.example.theatercoursework.model.enums.Voice;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeActor {
    private List<Actor> actors = new ArrayList<>(Arrays.asList(
            new Actor(null, "Савченко Ігор Васильович", Sex.MALE,
                      LocalDate.parse("1983-12-01"),null, EmployeeType.ACTOR,
                      13000, LocalDate.parse("2020-07-01"), "",
                      LocalDateTime.now(), LocalDateTime.now(),
                      183, Voice.BASS),
            new Actor(null, "Сідоров Степан Васильович", Sex.MALE,
                      LocalDate.parse("1978-10-11"),null,EmployeeType.ACTOR,
                      18000, LocalDate.parse("2007-12-12"), "",
                      LocalDateTime.now(), LocalDateTime.now(),
                      164, Voice.BASS),
            new Actor(null, "Лопатін Федор Станіславович", Sex.MALE,
                      LocalDate.parse("1983-04-28"),null,EmployeeType.ACTOR,
                      18000, LocalDate.parse("2012-07-18"), "",
                      LocalDateTime.now(), LocalDateTime.now(),
                      195, Voice.TENOR),
            new Actor(null, "Огорщук Максим Олександрович", Sex.MALE,
                      LocalDate.parse("2007-12-04"),null,EmployeeType.ACTOR,
                      7000, LocalDate.parse("2019-05-13"), "",
                      LocalDateTime.now(), LocalDateTime.now(),
                      156, Voice.TENOR),
            new Actor(null, "Кусяк Вікторія Олегівна", Sex.FEMALE,
                      LocalDate.parse("1978-11-27"),null,EmployeeType.ACTOR,
                      15800, LocalDate.parse("2010-07-19"), "",
                      LocalDateTime.now(), LocalDateTime.now(),
                      155, Voice.SOPRANO),
            new Actor(null, "Дроняк Софія Ігорівна", Sex.FEMALE,
                      LocalDate.parse("1996-10-14"),null,EmployeeType.ACTOR,
                      12500, LocalDate.parse("2020-07-19"), "",
                      LocalDateTime.now(), LocalDateTime.now(),
                      178, Voice.ALTO),
            new Actor(null, "Баршик Ольга Юріївна", Sex.FEMALE,
                      LocalDate.parse("1983-04-14"),null,EmployeeType.ACTOR,
                      11000, LocalDate.parse("2018-03-12"), "",
                      LocalDateTime.now(), LocalDateTime.now(),
                      168, Voice.ALTO),
            new Actor(null, "Біляк Олена Степанівна", Sex.FEMALE,
                      LocalDate.parse("2010-07-12"),null,EmployeeType.ACTOR,
                      7000, LocalDate.parse("2021-03-12"), "",
                      LocalDateTime.now(), LocalDateTime.now(),
                      140, Voice.SOPRANO)
                                                              ));

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
