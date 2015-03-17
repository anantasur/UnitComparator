package com.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LengthComparatorTest {
    @Test
    public void Test0ftIsEqualTo0inch (){
        Length u = new Length(0.0, UNITTYPE.FOOT);
        assertTrue(u.equals(new Length(0.0, UNITTYPE.INCH)));
    }

    @Test
    public void Test1ftIsEqualTo12inch (){
        Length u = new Length(1.0, UNITTYPE.FOOT);
        assertTrue(u.equals(new Length(12.0,UNITTYPE.INCH)));
    }
    @Test
    public void Test12inchIsEqualTo1ft (){
        Length u = new Length(0.0,UNITTYPE.INCH);
        assertTrue(u.equals(new Length(0.0, UNITTYPE.FOOT)));
    }
    @Test
    public void Test1inchIsEqualToPoint0254meters () {
        Length u = new Length(1.0, UNITTYPE.INCH);
        assertTrue(u.equals(new Length(0.0254, UNITTYPE.M)));
    }
    @Test
    public void Test1mIsEqualTo100centimeters (){
        Length u = new Length(1.0,UNITTYPE.M);
        assertTrue(u.equals(new Length(100.0, UNITTYPE.CM)));
    }
    @Test
    public void Test2inchIsEqualTo5_08centimeters (){
        Length u = new Length(2.0,UNITTYPE.INCH);
        assertTrue(u.equals(new Length(5.08, UNITTYPE.CM)));
    }
    @Test
    public void Test1meterIsEqualTo1000millimeters (){
        Length u = new Length(1.0,UNITTYPE.M);
        assertTrue(u.equals(new Length(1000.0, UNITTYPE.MM)));
    }
    @Test
    public void Test1kilometerIsEqualTo1000meters (){
        Length u = new Length(1.0,UNITTYPE.KM);
        assertTrue(u.equals(new Length(1000.0, UNITTYPE.M)));
    }
    @Test
    public void Test1MeterSum1MeterShouldGive2Meters(){
        Length len1 = new Length(1.0,UNITTYPE.M);
        Length len2 = new Length(1.0,UNITTYPE.M);
        assertEquals(2.0,len1.add(len2,UNITTYPE.M),0.0);
    }
    @Test
    public void Test1MeterSum1ftShouldGive4_281feet(){
        Length len1 = new Length(1.0,UNITTYPE.M);
        Length len2 = new Length(1.0,UNITTYPE.FOOT);
        assertEquals(4.281,len1.add(len2,UNITTYPE.FOOT),0.0);
    }
    @Test
    public void Test1InchSum1ftShouldGive1_083feet(){
        Length len1 = new Length(1.0,UNITTYPE.INCH);
        Length len2 = new Length(1.0,UNITTYPE.FOOT);
        assertEquals(1.083,len1.add(len2,UNITTYPE.FOOT),0.0);
    }
}
