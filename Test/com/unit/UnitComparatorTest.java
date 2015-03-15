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

}
