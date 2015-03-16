package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Length {
    private Double value;
    private UNITTYPE type;
    public static final Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();
    private static final double PRECISION = 0.001;

    static {
        unitConversionTable.put(UNITTYPE.INCH, 1.0);
        unitConversionTable.put(UNITTYPE.FOOT, 12.0);
        unitConversionTable.put(UNITTYPE.CM,0.39370079);
        unitConversionTable.put(UNITTYPE.M,39.3700787);
        unitConversionTable.put(UNITTYPE.MM,0.0393701);
        unitConversionTable.put(UNITTYPE.KM,39370.1);
    }

    public Length(double value, UNITTYPE type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Length length = (Length) o;

        return (Math.abs(compare(length)) < PRECISION);
    }

    @Override
    public int hashCode() {
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
    public double compare(Length length) {
        double unit2 = unitConversionTable.get(length.type) * length.value;
        double unit1 = unitConversionTable.get(this.type) * this.value;
        return unit1 - unit2;
    }
}
