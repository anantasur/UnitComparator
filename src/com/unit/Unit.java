package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Unit {
    private Double value;
    private String type;
    Map<String,Double> unitConversionTable = new HashMap<String, Double>();
    private static final double PRECISION = 0.001;


    public Unit (){
        unitConversionTable.put("inch",1.0);
        unitConversionTable.put("ft", 12.0);
        unitConversionTable.put("cm",0.39370079);
        unitConversionTable.put("m",39.3700787);
    }

    public void addValue(Double value) {
        this.value = value;
    }

    public void addUnit(String type) {
        this.type = type;
    }

    public boolean compare(Double value, String type) {
        double unit2 = unitConversionTable.get(type) * value;
        double unit1 = unitConversionTable.get(this.type) * this.value;
        return Math.abs(unit2 - unit1) < PRECISION;

    }
}
