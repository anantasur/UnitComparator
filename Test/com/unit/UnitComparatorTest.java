package com.unit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/*1ft = 12 inch*/
public class UnitComparatorTest {
    @Test
    public void Test0ftIsEqualTo0inch (){
        Unit u = new Unit();
        u.addValue(0.0);
        u.addUnit("ft");
        assertTrue(u.compare(0.0,"inch"));
    }

    @Test
    public void Test1ftIsEqualTo12inch (){
        Unit u = new Unit();
        u.addValue(1.0);
        u.addUnit("ft");
        assertTrue(u.compare(12.0,"inch"));
    }
    @Test
    public void Test12inchIsEqualTo1ft (){
        Unit u = new Unit();
        u.addValue(12.0);
        u.addUnit("inch");
        assertTrue(u.compare(1.0,"ft"));
    }
    @Test
    public void Test1inchIsEqualToPoint0254meters (){
        Unit u = new Unit();
        u.addValue(1.0);
        u.addUnit("inch");
        assertTrue(u.compare(0.0254,"m"));
    }
    @Test
    public void Test1mIsEqualToPoint100centimeters (){
        Unit u = new Unit();
        u.addValue(1.0);
        u.addUnit("m");
        assertTrue(u.compare(100.0,"cm"));
    }
}
