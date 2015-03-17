package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Volume extends ScalarQuantity {

    public static Map<UNITTYPE,Double> unitConversionTable;

    static {
        unitConversionTable = new HashMap<UNITTYPE, Double>();
        unitConversionTable.put(UNITTYPE.GALLON, 1.0);
        unitConversionTable.put(UNITTYPE.LITERS, 0.264172);
    }

    public Volume(double value, UNITTYPE type) {
        super(value, type,unitConversionTable);
    }
}
