package com.company.src.Lengths;


import org.junit.Test;

import static org.junit.Assert.*;

public class LengthTest {

    LengthConverter converter = new LengthConverter();

    @Test
    public void LengthConverterTestALLPASS() {

        double inf = Double.POSITIVE_INFINITY;

        //Feasible tests-------------------------------------------------- :)

        //KM to Mile
        assertEquals(0.6214, converter.kmToMile(1), 0);
        assertEquals(3.7282, converter.kmToMile(6), 0);
        assertEquals(62.1371, converter.kmToMile(100), 0);
        assertEquals(0, converter.kmToMile(0), 0);

        assertTrue(converter.kmToMileBoolean(1));
        assertTrue(converter.kmToMileBoolean(6));
        assertTrue(converter.kmToMileBoolean(100));
        assertTrue(converter.kmToMileBoolean(9999));

        //Mile to KM
        assertEquals(1.609, converter.mileToKm(1), 0);
        assertEquals(0.1609, converter.mileToKm(10), 0);
        assertEquals(0.008, converter.mileToKm(200), 0);
        assertEquals(inf, converter.mileToKm(0), 0);

        assertTrue(converter.mileToKmBoolean(1));
        assertTrue(converter.mileToKmBoolean(10));
        assertTrue(converter.mileToKmBoolean(200));
        assertTrue(converter.mileToKmBoolean(0));

    }

    //Feasible KM To MILE------------------------------------

    @Test
    public void FeasibleLengthConversionkmToMile(){
        assertEquals(0.6214, converter.kmToMile(1), 0);
    }

    @Test
    public void FeasibleLengthConversionkmToMile2(){
        assertEquals(3.7282, converter.kmToMile(6), 0);
    }

    @Test
    public void FeasibleLengthConversionkmToMile3(){
        assertEquals(62.1371, converter.kmToMile(100), 0);
    }

    @Test
    public void FeasibleLengthConversionkmToMile4(){
        assertEquals(0, converter.kmToMile(0), 0);
    }

    //Feasible MILE To KM------------------------------------

    @Test
    public void FeasibleLengthConversionMiletoKm(){
        assertEquals(1.609,converter.mileToKm(1),0);
    }

    @Test
    public void FeasibleLengthConversionMiletoKm2(){
        assertEquals(0.1609,converter.mileToKm(10),0);
    }

    @Test
    public void FeasibleLengthConversionMiletoKm3(){
        assertEquals(0.008,converter.mileToKm(200),0);
    }

    @Test
    public void FeasibleLengthConversionMiletoKm4(){
        double inf = Double.POSITIVE_INFINITY;
        assertEquals(inf,converter.mileToKm(0),0);
    }

    @Test
    public void LengthConverterTestALLFAIL() {


        //Failed tests-------------------------------------------------- :(

        //KM to Mile
        assertEquals(1.2, converter.kmToMile(1), 0);
        assertEquals(9, converter.kmToMile(6), 0);
        assertEquals(15, converter.kmToMile(100), 0);
        assertEquals(1, converter.kmToMile(0), 0);

        assertFalse(converter.kmToMileBoolean(1));
        assertFalse(converter.kmToMileBoolean(6));
        assertFalse(converter.kmToMileBoolean(100));
        assertFalse(converter.kmToMileBoolean(9999));

        //Mile to KM
        assertEquals(3,converter.mileToKm(1),0);
        assertEquals(98,converter.mileToKm(10),0);
        assertEquals(8,converter.mileToKm(200),0);
        assertEquals(0,converter.mileToKm(0),0);

        assertFalse(converter.mileToKmBoolean(1));
        assertFalse(converter.mileToKmBoolean(10));
        assertFalse(converter.mileToKmBoolean(200));
        assertFalse(converter.mileToKmBoolean(0));
    }

    //Failing KM To MILE------------------------------------

    @Test
    public void FailingLengthConversionkmToMile(){
        assertEquals(1.2, converter.kmToMile(1), 0);
    }

    @Test
    public void FailingLengthConversionkmToMile2(){
        assertEquals(9, converter.kmToMile(6), 0);
    }

    @Test
    public void FailingLengthConversionkmToMile3(){
        assertEquals(15, converter.kmToMile(100), 0);
    }

    @Test
    public void FailingLengthConversionkmToMile4(){
        assertEquals(1, converter.kmToMile(0), 0);
    }

    //Failing Mile To KM------------------------------------

    @Test
    public void FailingLengthConversionMileToKm(){
        assertEquals(3,converter.mileToKm(1),0);
    }

    @Test
    public void FailingLengthConversionMileToKm2(){
        assertEquals(98,converter.mileToKm(10),0);
    }

    @Test
    public void FailingLengthConversionMileToKm3(){
        assertEquals(8,converter.mileToKm(200),0);
    }

    @Test
    public void FailingLengthConversionMileToKm4(){
        assertEquals(0,converter.mileToKm(0),0);
    }
}
