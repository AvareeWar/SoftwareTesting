package com.company.src.Lengths;

import java.text.DecimalFormat;

public class LengthConverter {

    DecimalFormat df = new DecimalFormat("#.####");

    public double kmToMile(double km){
        double mile = 0;
        if (km != -1){
            try{
                mile = 0.621371192 * km;
                if (mile >= 0) {
                    return Double.parseDouble(df.format(mile));
                }
            }catch(IllegalArgumentException e){System.out.println(e); System.out.println("Could not convert KM to Miles");}
        }
        return mile;
    }

    public double mileToKm(double mile) {
        double km = 0;
        if (mile != -1){
            try{
                km = 1.609 / mile;
                if(km >= 0) {
                    return Double.parseDouble(df.format(km));
                }
            }catch(IllegalArgumentException e){System.out.println(e); System.out.println("Could not convert Miles to KM");}
        }
        return km;
    }

    public boolean kmToMileBoolean(double km){
        double mile = 0;
        if (km != -1){
            try{
                mile = 0.621371192 * km;
                if (mile >= 0) {
                    return true;
                }
            }catch(IllegalArgumentException e){System.out.println(e); System.out.println("Could not convert KM to Miles");}
        }
        return false;
    }

    public boolean mileToKmBoolean(double mile) {
        double km = 0;
        if (mile != -1){
            try{
                km = 1.609 / mile;
                if(km >= 0) {
                    return true;
                }
            }catch(IllegalArgumentException e){System.out.println(e); System.out.println("Could not convert Miles to KM");}
        }
        return false;
    }
}
