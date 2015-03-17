package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Length extends ScalarQuantity<LENGTH_UNIT> {

   public static Map<LENGTH_UNIT,Double> unitConversionTable;

    static {
        unitConversionTable = new HashMap<LENGTH_UNIT, Double>();
        unitConversionTable.put(LENGTH_UNIT.INCH, 1.0);
        unitConversionTable.put(LENGTH_UNIT.FOOT, 12.0);
        unitConversionTable.put(LENGTH_UNIT.CM,0.39370079);
        unitConversionTable.put(LENGTH_UNIT.M,39.3700787);
        unitConversionTable.put(LENGTH_UNIT.MM,0.0393701);
        unitConversionTable.put(LENGTH_UNIT.KM,39370.1);
    }

    public Length(double value, LENGTH_UNIT type) {
        super(value, type, unitConversionTable);
    }
}
