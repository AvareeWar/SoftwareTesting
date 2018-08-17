package com.company.Calculator;

import java.util.ArrayList;
import java.util.List;

public class XcelReader extends Master {

    private static Paths strategy = new Paths();
    private static Master master = new Master();

    public static ArrayList<Meta_Data> setMetaData()
    {
        // Initialize temp variables
        ArrayList<Meta_Data> tempArray = new ArrayList<>();

        // Grab excel document and input into a list of list of strings
        ArrayList<List<String>> excelData = master.readExcelFileRows(strategy.get_excel_data());

        // Loop parses the excelData
        for (int i = 0; i < excelData.size(); i++)
        {

            Meta_Data TempVar = new Meta_Data();

            // Set properties of TempVar
            TempVar.state =  excelData.get(i).get(0);
            //System.out.print(TempVar.state + ", ");

            //TempVar.salesTax = Float.valueOf(excelData.get(i).get(1));

            TempVar.salesTax = Double.parseDouble(excelData.get(i).get(1));
            //System.out.println(TempVar.salesTax);

            tempArray.add(TempVar);


        }
        return tempArray;
    }



}
