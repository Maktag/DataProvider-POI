package com.POI.test.POItest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DProvider 
{
	@DataProvider
	public Object[][] returndata() throws IOException {
        // TODO Auto-generated method stub
        File excel =  new File ("Book1.xlsx");
        FileInputStream fis = new FileInputStream(excel);
        @SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet ws = wb.getSheet("Sheet1");

        int rowNum = ws.getLastRowNum() + 1;
        int colNum = ws.getRow(0).getLastCellNum();
        Object [][] data = new Object [rowNum] [colNum];

        for(int i = 0; i <rowNum; i++){
            XSSFRow row = ws.getRow(i);
                for (int j = 0; j < colNum; j++){
                    XSSFCell cell = row.getCell(j);
                    String value = cell.toString();
                    data[i][j] = value;
//                  System.out.println ("the value is " + value);
                }
        }
        return data;
    }
}
