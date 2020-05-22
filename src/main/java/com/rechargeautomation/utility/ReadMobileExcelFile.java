package com.rechargeautomation.utility;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ReadMobileExcelFile {
	
	public static FileInputStream fis;
	public static XSSFWorkbook wb;
	public static XSSFSheet sheet;
	public static String row;
	public static XSSFCell cell;
	
	
	public static Object[][] getExcelData() throws IOException {
		String[][] arrayExcelData = null;
		String Filepath=System.getProperty("user.dir")+File.separator+"Data"+File.separator+"RechargeTestData.xlsx";
		FileInputStream fs = new FileInputStream(Filepath);
		//fis=new FileInputStream("C:\\Users\\ajain153\\Desktop\\Test Data.xlsx");
		wb=new XSSFWorkbook(fs);
		sheet=wb.getSheet("MobilePrepaidTestdata");

		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();

		//Create a loop over all the rows of excel file to read it

	/*	for (int i = 0; i < rowCount+1; i++) {

			Row row = sheet.getRow(i);

			//Create a loop to print cell values in a row

			for (int j = 0; j < row.getLastCellNum(); j++) {

				//Print Excel data in console

				arrayExcelData[i-1][j]=row.getCell(j).getStringCellValue();

			}
    
	}
		return arrayExcelData;}*/
		Object[][] data=new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
	       
        for(int i=0; i<sheet.getLastRowNum();i++)
        {
           
            for(int j=0; j<sheet.getRow(0).getLastCellNum();j++)
            {
               data[i][j]=sheet.getRow(i+1).getCell(j).toString();
                //data= wb.getSheetAt(0).getRow(0).getCell(1).getNumericCellValue();
               
            }																																											
        }
       
        return data;	
	}
}