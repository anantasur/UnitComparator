package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Unit {
    private Double value;
    private UNITTYPE type;
    public static final Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();
    private static final double PRECISION = 0.001;

    static {
        unitConversionTable.put(UNITTYPE.INCH,1.0);
        unitConversionTable.put(UNITTYPE.FOOT, 12.0);
        unitConversionTable.put(UNITTYPE.CM,0.39370079);
        unitConversionTable.put(UNITTYPE.M,39.3700787);
    }

    public Unit(double value, UNITTYPE type) {
        this.value = value;
        this.type = type;
    }

    public boolean compare(Double value, UNITTYPE type) {
        double unit2 = unitConversionTable.get(type) * value;
        double unit1 = unitConversionTable.get(this.type) * this.value;
        return Math.abs(unit2 - unit1) < PRECISION;
    }
}
