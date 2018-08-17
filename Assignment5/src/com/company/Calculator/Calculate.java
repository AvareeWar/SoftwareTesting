package com.company.Calculator;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;

//import static org.testng.Assert.fail;

public class Calculate extends Master{

    public static ArrayList<Meta_Data> data = new ArrayList<>();


    public static float calculateTotal(float rawTotal, String shippingMethod, String destinationState){

        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        rawTotal = 0;
        double shippingPrice = 0;
        data = XcelReader.setMetaData();
        int i;
        try {
            try {
                if (shippingMethod.equals("Standard")) {
                    //apply rate
                    shippingPrice += 10;
                }
                if (shippingMethod.equals("Next-Day")) {
                    //apply rate
                    shippingPrice += 25;
                }
                /*if(shippingMethod.equals("")){
                    fail();
                }*/
            }
            catch(IllegalArgumentException e){
                System.out.println(e);
            }

            for(i = 0; i < data.size(); i++){
                    if(destinationState.equals(data.get(i).state)){
                        shippingPrice = shippingPrice + data.get(i).salesTax;
                    }
                    /*if(!destinationState.equals(data.get(i).state) || destinationState.equals("")){
                        fail();
                    }*/
            }
            rawTotal = (float) shippingPrice;
        }
        catch(IllegalArgumentException e){
            System.out.println(e);
        }
        String item = df.format(rawTotal);
        return Float.parseFloat(item);
    }
}
