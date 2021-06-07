package com.example.theatercoursework.data;


import com.example.theatercoursework.model.Spectacle;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class FakeSpectacle {
    private List<Spectacle> spectacles = new ArrayList<>(Arrays.asList(

                                                                       ));

    public List<Spectacle> getSpectacles() {
        return spectacles;
    }

    public void setSpectacles(List<Spectacle> specttacles) {
        this.spectacles = specttacles;
    }
}
