package com.example.theatercoursework.data;

import com.example.theatercoursework.model.Hall;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeHall {
    private List<Hall> halls = new ArrayList<>(Arrays.asList(
            Hall.builder()
                .id(null)
                .usual(50)
                .balcony(20)
                .vip(15)
                .description("")
                .created_at(LocalDateTime.now())
                .modified_at(LocalDateTime.now())
                .build(),
            Hall.builder()
                .id(null)
                .usual(100)
                .balcony(45)
                .vip(25)
                .description("")
                .created_at(LocalDateTime.now())
                .modified_at(LocalDateTime.now())
                .build()
                                                            ));

    public List<Hall> getHalls() {
        return halls;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }
}
