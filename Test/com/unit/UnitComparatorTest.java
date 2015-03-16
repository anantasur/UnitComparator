package com.unit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/*1ft = 12 inch*/
public class UnitComparatorTest {
    @Test
    public void Test0ftIsEqualTo0inch (){
        Unit u = new Unit(0.0, UNITTYPE.FOOT);
        assertTrue(u.compare(0.0,UNITTYPE.INCH));
    }

    @Test
    public void Test1ftIsEqualTo12inch (){
        Unit u = new Unit(1.0, UNITTYPE.FOOT);
        assertTrue(u.compare(12.0,UNITTYPE.INCH));
    }
    @Test
    public void Test12inchIsEqualTo1ft (){
        Unit u = new Unit(0.0,UNITTYPE.INCH);
        assertTrue(u.compare(0.0, UNITTYPE.FOOT));
    }
    @Test
    public void Test1inchIsEqualToPoint0254meters () {
        Unit u = new Unit(1.0, UNITTYPE.INCH);
        assertTrue(u.compare(0.0254, UNITTYPE.M));
    }
    @Test
    public void Test1mIsEqualTo100centimeters (){
        Unit u = new Unit(1.0,UNITTYPE.M);
        assertTrue(u.compare(100.0, UNITTYPE.CM));
    }
    @Test
    public void Test2inchIsEqualTo5_08centimeters (){
        Unit u = new Unit(2.0,UNITTYPE.INCH);
        assertTrue(u.compare(5.08, UNITTYPE.CM));
    }
}