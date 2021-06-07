package com.example.theatercoursework.model.enums;

public enum PerformanceType {
    PREMIERE(1.5),
    USUAL(1.0);

    private final Double value;
    private PerformanceType(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
