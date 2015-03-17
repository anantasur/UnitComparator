package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Volume extends Comparator{
    private Double value;
    private UNITTYPE type;
    public static final Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();

    static {
        unitConversionTable.put(UNITTYPE.GALLON, 1.0);
        unitConversionTable.put(UNITTYPE.LITERS, 0.264172);
    }

    public Volume(double value, UNITTYPE type) {
        super(value, type,unitConversionTable);
    }
}
