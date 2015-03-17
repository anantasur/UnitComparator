package com.unit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VolumeComparisonTest {
    @Test
    public void Test0gallonIsEqualTo0liters (){
        Volume v = new Volume(0.0, VOLUME_UNIT.GALLON);
        assertTrue(v.equals(new Volume(0.0,VOLUME_UNIT.LITERS)));
    }
    @Test
    public void Test1gallonIsEqualTo3_78541liters (){
        Volume v = new Volume(1.0, VOLUME_UNIT.GALLON);
        assertTrue(v.equals(new Volume(3.7854,VOLUME_UNIT.LITERS)));
    }
    @Test
    public void Test1GallonSum1GallonShouldGive2Gallons(){
        Volume volume1 = new Volume(1.0,VOLUME_UNIT.GALLON);
        Volume volume2 = new Volume(1.0,VOLUME_UNIT.GALLON);
        assertEquals(2.0,volume1.add(volume2,VOLUME_UNIT.GALLON),0.0);
    }
    @Test
    public void Test1ltSum1GallonShouldGive4_785Lt(){
        Volume volume1 = new Volume(1.0,VOLUME_UNIT.GALLON);
        Volume volume2 = new Volume(1.0,VOLUME_UNIT.LITERS);
        assertEquals(4.785,volume1.add(volume2,VOLUME_UNIT.LITERS),0.0);
    }

}