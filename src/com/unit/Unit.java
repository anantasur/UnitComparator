package com.unit;

import java.util.Map;

public class Unit {
    private Double value;
    private String type;
    Map<String,Double> unitConversionTable;

    public void addValue(Double value) {
        this.value = value;
    }

    public void addUnit(String type) {
        this.type = type;
    }

    public boolean compare(Double value, String type) {
        return true;
    }
}
