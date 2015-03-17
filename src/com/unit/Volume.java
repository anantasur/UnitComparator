package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Volume extends ScalarQuantity<VOLUME_UNIT> {

    public static Map<VOLUME_UNIT,Double> unitConversionTable;

    static {
        unitConversionTable = new HashMap<VOLUME_UNIT, Double>();
        unitConversionTable.put(VOLUME_UNIT.GALLON, 1.0);
        unitConversionTable.put(VOLUME_UNIT.LITERS, 0.264172);
    }

    public Volume(double value, VOLUME_UNIT type) {
        super(value, type,unitConversionTable);
    }
}
