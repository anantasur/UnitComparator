package com.unit;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
public class ComparatorTest {
    public static final Map<UNITTYPE,Double> unitConversionTable = new HashMap<UNITTYPE, Double>();
        static{
            unitConversionTable.put(UNITTYPE.GALLON, 1.0);
            unitConversionTable.put(UNITTYPE.LITERS, 0.264172);
            unitConversionTable.put(UNITTYPE.INCH, 1.0);
            unitConversionTable.put(UNITTYPE.FOOT, 12.0);
            unitConversionTable.put(UNITTYPE.CM,0.39370079);
            unitConversionTable.put(UNITTYPE.M,39.3700787);
            unitConversionTable.put(UNITTYPE.MM,0.0393701);
            unitConversionTable.put(UNITTYPE.KM,39370.1);
        }
    @Test
    public void convertConverts1ftTo12Inches(){
        ScalarQuantity c = new ScalarQuantity(1.0,UNITTYPE.FOOT, unitConversionTable);
        assertEquals(12.0, c.convert(c), 0.0);
    }
    @Test
    public void convertConverts1KmTo39370_1Inches(){
        ScalarQuantity c = new ScalarQuantity(1.0,UNITTYPE.KM, unitConversionTable);
        assertEquals(39370.1, c.convert(c), 0.0);
    }
    @Test
    public void Test1LitersIsEqualToPoint264172Gallon () {
        ScalarQuantity v = new ScalarQuantity(1.0, UNITTYPE.LITERS, unitConversionTable);
        assertEquals(0.264172, v.convert(v), 0.0);
    }

    @Test
    public void Test1gallonIsEqualTo3_78541liters (){
        ScalarQuantity v = new ScalarQuantity(1.0, UNITTYPE.GALLON, unitConversionTable);
        assertTrue(v.compare(new ScalarQuantity(3.7854, UNITTYPE.LITERS, unitConversionTable)));
    }

    @Test
    public void Test2inchIsEqualTo5_08centimeters (){
        ScalarQuantity c = new ScalarQuantity(2.0,UNITTYPE.INCH, unitConversionTable);
        assertTrue(c.compare(new ScalarQuantity(5.08, UNITTYPE.CM, unitConversionTable)));
    }

    @Test
    public void Test1kilometerIsEqualTo1000meters (){
        ScalarQuantity c = new ScalarQuantity(1.0,UNITTYPE.KM, unitConversionTable);
        assertTrue(c.compare(new ScalarQuantity(1000.0, UNITTYPE.M, unitConversionTable)));
    }

    @Test
    public void Test1meterIsEqualTo1000millimeters (){
        ScalarQuantity c = new ScalarQuantity(1.0,UNITTYPE.M, unitConversionTable);
        assertTrue(c.compare(new ScalarQuantity(1000.0, UNITTYPE.MM, unitConversionTable)));
    }
}
