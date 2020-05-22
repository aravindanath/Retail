package com.rechargeautomation.utility;

import java.io.IOException;

import org.testng.annotations.DataProvider;

public class Dataprovider {
	static ReadMobileExcelFile readMobileExcelFile=new ReadMobileExcelFile();
	@DataProvider(name="MobileTestdata")
	public static Object[][] ReadExcelFile() throws IOException
	{   
		//Object[][] arrayObject = readMobileExcelFile.getExcelData("D:\\RechargeTestData\\RechargeTestData.xlsx","MobilePrepaidTestdata");
		Object[][] arrayObject=readMobileExcelFile.getExcelData();
		return arrayObject;
	}

}
