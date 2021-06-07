package com.example.theatercoursework.model.enums;

public enum PlaceType {
    USUAL(1.0),
    BALCONY(1.2),
    VIP(1.5);

    private final Double value;
    private PlaceType(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
