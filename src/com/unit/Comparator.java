package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Comparator<T> {
    private final double value;
    private final UNITTYPE type;
    private static final double PRECISION = 0.1;
    public Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();

    public Comparator(double value, UNITTYPE type, Map<UNITTYPE, Double> unitConversionTable) {
        this.value = value;
        this.type = type;
        this.unitConversionTable = unitConversionTable;
    }

    public double convert(Comparator object) {
        return unitConversionTable.get(object.type) * object.value;
    }

    public boolean compare(Comparator object){
        return Math.abs(convert(object) - convert(this)) < PRECISION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Comparator that = (Comparator) o;
        return compare(that);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (unitConversionTable != null ? unitConversionTable.hashCode() : 0);
        return result;
    }
}
