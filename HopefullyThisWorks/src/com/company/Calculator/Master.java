package com.company.Calculator;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Master {


    private int numAccountsToCreateFromExcelDoc = 0;
    public void setNumAccountsToCreateFromExcelDoc(int num){this.numAccountsToCreateFromExcelDoc = num;}

    public ArrayList<List<String>> readExcelFileRows(String file)
    {
        try
        {
            POIFSFileSystem fs = new POIFSFileSystem(new FileInputStream(file));
            HSSFWorkbook wb = new HSSFWorkbook(fs);
            HSSFSheet sheet = wb.getSheetAt(0);
            HSSFRow row;
            HSSFCell cell;
            DataFormatter formatter = new DataFormatter();

            int rows = sheet.getPhysicalNumberOfRows();
            int cols = 0; // No of columns
            int tmp;
            ArrayList<List<String>> rowList = new ArrayList<>();
            setNumAccountsToCreateFromExcelDoc(rows - 1);

            // This trick ensures that we get the data properly even if it doesn't start from first few rows
            for(int i = 0; i < 10 || i < rows; i++)
            {
                row = sheet.getRow(i);
                if(row != null)
                {
                    tmp = sheet.getRow(i).getPhysicalNumberOfCells();
                    if(tmp > cols) cols = tmp;
                }
            }

            for(int r = 0; r < rows; r++)
            {
                List<String> rowContent = new ArrayList<>();
                row = sheet.getRow(r);
                if(row != null)
                {
                    for(int c = 0; c < cols; c++)
                    {
                        cell = row.getCell((short)c);
                        if(cell != null)
                        {
                            rowContent.add(formatter.formatCellValue(cell));
                        }
                    }
                }
                rowList.add(rowContent);
            }
            //System.out.println(rowList.toString());
            return rowList;
        }
        catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("Could not find Excel doc");
        }
        return null;
    }

}
