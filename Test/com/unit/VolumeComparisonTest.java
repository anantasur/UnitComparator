package com.unit;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VolumeComparisonTest {
    @Test
    public void Test0gallonIsEqualTo0liters (){
        Volume v = new Volume(0.0, UNITTYPE.GALLON);
        assertTrue(v.equals(new Volume(0.0,UNITTYPE.LITERS)));
    }
    @Test
    public void Test1gallonIsEqualTo3_78541liters (){
        Volume v = new Volume(1.0, UNITTYPE.GALLON);
        assertTrue(v.equals(new Volume(3.7854,UNITTYPE.LITERS)));
    }
}