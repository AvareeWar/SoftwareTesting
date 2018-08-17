package com.company.Calculator;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ShippingTest extends Master {

    public static ArrayList<Meta_Data> data = new ArrayList<>();

    @Test
    public void tester(){

        data = XcelReader.setMetaData();
        //Calculate cal = new Calculate();

        for (int i = 0; i < data.size(); i++){
            System.out.print(data.get(i).state + ", ");
            System.out.println(data.get(i).salesTax);
        }

        //assertEquals(cal.calculateTotal(0,"Standard", "AL"), 19.01)

    }

    //pass
    @Test
    public void testCalculations2(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Standard", "AL"), 19.010000228881836,0);
    }
    //pass
    @Test
    public void testCalculations3(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Next-Day","NY"), 33.4900016784668,0);
    }

    //pass
    @Test
    public void testCalculations4(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"", ""), 0,0);
    }

    //pass
    @Test
    public void testCalculations5(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"", "AL"), 9.010000228881836,0);
    }

    //fail
    @Test
    public void testCalculations6(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"", "AL"), 19.010000228881836,0);
    }

    //pass
    @Test
    public void testCalculations7(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Standard", ""), 10,0);
    }

    //fail
    @Test
    public void testCalculations8(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Standard", ""), 25,0);
    }

    //pass
    @Test
    public void testCalculations9(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Next-Day", ""), 25,0);
    }

    //fail
    @Test
    public void testCalculations10(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Next-Day", ""), 10,0);
    }

    //fail
    @Test
    public void testCalculations11(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Next-Day", ""), 0,0);
    }


    //fail
    @Test
    public void testCalculations12(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Next-Day", "NJ"), 0,0);
    }

    //fail
    @Test
    public void testCalculations13(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"Standard", "NJ"), 0,0);
    }

    //fail
    @Test
    public void testCalculations14(){
        Calculate cal = new Calculate();
        assertEquals(cal.calculateTotal(0,"", "NJ"), 0,0);
    }







}
