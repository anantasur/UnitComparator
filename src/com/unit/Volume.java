package com.unit;

public class Volume extends Comparator{
    private Double value;
    private UNITTYPE type;
    private static final double PRECISION = 0.001;

    public Volume(double value, UNITTYPE type) {
        super(value, type);
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
        int result = value != null ? value.hashCode() : 0;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
}
