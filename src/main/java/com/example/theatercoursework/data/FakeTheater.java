package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Theater;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeTheater {
    private List<Theater> theaters = new ArrayList<>(Arrays.asList(
            new Theater(null, "Чернівці", "Тетральна площа 1", "",
                        LocalDateTime.now(), LocalDateTime.now())
                                                                  ));

    public List<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        this.theaters = theaters;
    }
}
