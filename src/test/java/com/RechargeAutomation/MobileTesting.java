package com.RechargeAutomation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rechargeautomation.base.Setup;
import com.rechargeautomation.screen.MobileRecahargeHome;
import com.rechargeautomation.screen.MobileRechargePayScreen;
import com.rechargeautomation.screen.PayzappHome;
import com.rechargeautomation.utility.*;
import com.rechargeautomation.screen.RechargeHome;
import com.relevantcodes.extentreports.LogStatus;


public class MobileTesting extends Setup {
	PayzappHome payzappHome;
	RechargeHome rechargeHome;
	MobileRecahargeHome mobileRecahargeHome;
	MobileRechargePayScreen mobileRechargePayScreen;
	ReadMobileExcelFile readMobileExcelFile;
	Dataprovider dataprovider;
/*static ReadMobileExcelFile readMobileExcelFile=new ReadMobileExcelFile();
	@DataProvider(name="MobileTestdata")
	public static Object[][] ReadExcelFile() throws IOException
	{   
		//Object[][] arrayObject = readMobileExcelFile.getExcelData("D:\\RechargeTestData\\RechargeTestData.xlsx","MobilePrepaidTestdata");
		Object[][] arrayObject=readMobileExcelFile.getExcelData();
		return arrayObject;
	}*/
	@Test(priority=1)
	public void VarifyRechargeIcon() 
	{ 
		extent_logger=extentreports.startTest("Test Recharge icon in dash board  ", "Validate recharge icon in dash board ");
		payzappHome=PageFactory.initElements(driver, PayzappHome.class);
		extent_logger.log(LogStatus.INFO, "Click on Recharge Icon");
		payzappHome.ClickOnRechargeIcon();
	}
	@Test(priority=2,dataProvider="MobileTestdata", dataProviderClass = DataProvider.class)
	public void VarifyMobieIcon(String mobilenumber,String operator,String amount) throws InterruptedException 
	{ 
		extent_logger=extentreports.startTest("Test Mobile icon in dash board  ", "Validate Mobile icon in dash board ");
		rechargeHome=PageFactory.initElements(driver, RechargeHome.class);
		mobileRecahargeHome=PageFactory.initElements(driver, MobileRecahargeHome.class);
		mobileRechargePayScreen=PageFactory.initElements(driver, MobileRechargePayScreen.class);
		//dataprovider=PageFactory.initElements(driver, Dataprovider.class);
		readMobileExcelFile=PageFactory.initElements(driver, ReadMobileExcelFile.class);
		extent_logger.log(LogStatus.INFO, "Click on Recharge Icon");
		rechargeHome.ClickOnMobileIcon();
		mobileRecahargeHome.entermblnumbertxtbox(mobilenumber);
		mobileRecahargeHome.selectPrepaidService(driver);
		mobileRechargePayScreen.clickOperatorDrpDwn();
		mobileRechargePayScreen.SelectOperator(driver, operator);
		mobileRechargePayScreen.Amount(amount);
		mobileRechargePayScreen.Pay();
	}
}
