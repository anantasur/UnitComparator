package com.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ComparatorTest {
    @Test
    public void convertConverts1ftTo12Inches(){
        Comparator c = new Comparator(1.0,UNITTYPE.FOOT);
        assertEquals(12.0, c.convert(c), 0.0);
    }
    @Test
    public void convertConverts1KmTo39370_1Inches(){
        Comparator c = new Comparator(1.0,UNITTYPE.KM);
        assertEquals(39370.1, c.convert(c), 0.0);
    }
    @Test
    public void Test1LitersIsEqualToPoint264172Gallon () {
        Comparator v = new Comparator(1.0, UNITTYPE.LITERS);
        assertEquals(0.264172, v.convert(v), 0.0);
    }

    @Test
    public void Test1gallonIsEqualTo3_78541liters (){
        Comparator v = new Comparator(1.0, UNITTYPE.GALLON);
        assertTrue(v.compare(new Comparator(3.7854, UNITTYPE.LITERS)));
    }

    @Test
    public void Test2inchIsEqualTo5_08centimeters (){
        Comparator c = new Comparator(2.0,UNITTYPE.INCH);
        assertTrue(c.compare(new Comparator(5.08, UNITTYPE.CM)));
    }
}
