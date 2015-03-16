package com.unit;

import java.util.HashMap;
import java.util.Map;

public class Volume {
    private double value;
    private UNITTYPE type;
    public static final Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();
    private static final double PRECISION = 0.001;

    static {
        unitConversionTable.put(UNITTYPE.GALLON, 1.0);
        unitConversionTable.put(UNITTYPE.LITERS, 3.78541178);
    }

    public Volume(double value, UNITTYPE type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Volume volume = (Volume) o;
        return (Math.abs(compare(volume)) < PRECISION);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }

    private Double compare(Volume volume){
        double unit2 = unitConversionTable.get(volume.type) * volume.value;
        double unit1 = unitConversionTable.get(this.type) * this.value;
        return unit2-unit1;
    }
}
