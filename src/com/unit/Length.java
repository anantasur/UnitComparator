package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Length extends Comparator{
    private Double value;
    private UNITTYPE type;
    public static Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();

    static {
        unitConversionTable.put(UNITTYPE.INCH, 1.0);
        unitConversionTable.put(UNITTYPE.FOOT, 12.0);
        unitConversionTable.put(UNITTYPE.CM,0.39370079);
        unitConversionTable.put(UNITTYPE.M,39.3700787);
        unitConversionTable.put(UNITTYPE.MM,0.0393701);
        unitConversionTable.put(UNITTYPE.KM,39370.1);
    }

    public Length(double value, UNITTYPE type) {
        super(value, type, unitConversionTable);
    }
}
