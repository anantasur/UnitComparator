package com.unit;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class ScalarUnitTest {
    public static final Map<VOLUME_UNIT,Double> volumeConversionTable = new HashMap<VOLUME_UNIT, Double>();
    public static final Map<LENGTH_UNIT,Double> lengthConversionTable = new HashMap<LENGTH_UNIT, Double>();
        static {
            volumeConversionTable.put(VOLUME_UNIT.GALLON, 1.0);
            volumeConversionTable.put(VOLUME_UNIT.LITERS, 0.264172);
        }
        static{
            lengthConversionTable.put(LENGTH_UNIT.INCH, 1.0);
            lengthConversionTable.put(LENGTH_UNIT.FOOT, 12.0);
            lengthConversionTable.put(LENGTH_UNIT.CM,0.39370079);
            lengthConversionTable.put(LENGTH_UNIT.M,39.3700787);
            lengthConversionTable.put(LENGTH_UNIT.MM,0.0393701);
            lengthConversionTable.put(LENGTH_UNIT.KM,39370.1);
        }
    @Test
    public void convertConverts1ftTo12Inches(){
        ScalarQuantity c = new ScalarQuantity(1.0,LENGTH_UNIT.FOOT, lengthConversionTable);
        assertEquals(12.0, c.convert(c), 0.0);
    }
    @Test
    public void convertConverts1KmTo39370_1Inches(){
        ScalarQuantity c = new ScalarQuantity(1.0,LENGTH_UNIT.KM, lengthConversionTable);
        assertEquals(39370.1, c.convert(c), 0.0);
    }
    @Test
    public void Test1LitersIsEqualToPoint264172Gallon () {
        ScalarQuantity v = new ScalarQuantity(1.0, VOLUME_UNIT.LITERS, volumeConversionTable);
        assertEquals(0.264172, v.convert(v), 0.0);
    }

    @Test
    public void Test1gallonIsEqualTo3_78541liters (){
        ScalarQuantity v = new ScalarQuantity(1.0, VOLUME_UNIT.GALLON, volumeConversionTable);
        assertTrue(v.compare(new ScalarQuantity(3.7854, VOLUME_UNIT.LITERS, volumeConversionTable)));
    }

    @Test
    public void Test2inchIsEqualTo5_08centimeters (){
        ScalarQuantity c = new ScalarQuantity(2.0,LENGTH_UNIT.INCH, lengthConversionTable);
        assertTrue(c.compare(new ScalarQuantity(5.08, LENGTH_UNIT.CM, lengthConversionTable)));
    }

    @Test
    public void Test1kilometerIsEqualTo1000meters (){
        ScalarQuantity c = new ScalarQuantity(1.0,LENGTH_UNIT.KM, lengthConversionTable);
        assertTrue(c.compare(new ScalarQuantity(1000.0, LENGTH_UNIT.M, lengthConversionTable)));
    }

    @Test
    public void Test1meterIsEqualTo1000millimeters (){
        ScalarQuantity c = new ScalarQuantity(1.0,LENGTH_UNIT.M, lengthConversionTable);
        assertTrue(c.compare(new ScalarQuantity(1000.0, LENGTH_UNIT.MM, lengthConversionTable)));
    }
}
