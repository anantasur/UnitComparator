package com.unit;

import java.util.HashMap;
import java.util.Map;

public class ScalarQuantity {
    private final double value;
    private final UNITTYPE type;
    private static final double PRECISION = 0.1;
    public Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();

    public ScalarQuantity(double value, UNITTYPE type, Map<UNITTYPE, Double> unitConversionTable) {
        this.value = value;
        this.type = type;
        this.unitConversionTable = unitConversionTable;
    }

    public double convert(ScalarQuantity object) {
        return unitConversionTable.get(object.type) * object.value;
    }

    public boolean compare(ScalarQuantity object){
        return Math.abs(convert(object) - convert(this)) < PRECISION;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScalarQuantity that = (ScalarQuantity) o;
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

    public double add(ScalarQuantity len2, UNITTYPE type) {
        Double sum =  convert(len2)+ convert(this);
        return Math.round(sum / unitConversionTable.get(type)*1000.0)/1000.0;
    }
}
