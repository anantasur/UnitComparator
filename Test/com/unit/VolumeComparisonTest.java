package com.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
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
    @Test
    public void Test1GallonSum1GallonShouldGive2Gallons(){
        Volume volume1 = new Volume(1.0,UNITTYPE.GALLON);
        Volume volume2 = new Volume(1.0,UNITTYPE.GALLON);
        assertEquals(2.0,volume1.add(volume2,UNITTYPE.GALLON),0.0);
    }
    @Test
    public void Test1ltSum1GallonShouldGive4_785Lt(){
        Volume volume1 = new Volume(1.0,UNITTYPE.GALLON);
        Volume volume2 = new Volume(1.0,UNITTYPE.LITERS);
        assertEquals(4.785,volume1.add(volume2,UNITTYPE.LITERS),0.0);
    }

}