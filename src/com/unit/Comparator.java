package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Comparator {
    private final double value;
    private final UNITTYPE type;
    private static final double PRECISION = 0.1;
    public static final Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();

    static {
        unitConversionTable.put(UNITTYPE.INCH, 1.0);
        unitConversionTable.put(UNITTYPE.FOOT, 12.0);
        unitConversionTable.put(UNITTYPE.CM,0.39370079);
        unitConversionTable.put(UNITTYPE.M,39.3700787);
        unitConversionTable.put(UNITTYPE.MM,0.0393701);
        unitConversionTable.put(UNITTYPE.KM,39370.1);
        unitConversionTable.put(UNITTYPE.GALLON, 1.0);
        unitConversionTable.put(UNITTYPE.LITERS, 0.264172);
    }

    public Comparator(double value, UNITTYPE type) {
        this.value = value;
        this.type = type;
    }

    public double convert(Comparator object) {
        return unitConversionTable.get(object.type) * object.value;
    }

    public boolean compare(Comparator object){
        return Math.abs(convert(object) - convert(this)) < PRECISION;
    }
}
