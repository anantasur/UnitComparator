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
    public void Test1LitersIsEqualToPoint264172Gallon (){
        Volume v = new Volume(1.0, UNITTYPE.LITERS);
        assertEquals(0.264172, v.convert(v), 0.0);
    }
}
