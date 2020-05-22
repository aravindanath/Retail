package com.rechargeautomation.screen;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.rechargeautomation.utility.*;



public class MobileRecahargeHome extends ReadMobileExcelFile {
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/main_mobile")
	protected static WebElement EnterMobileNumber;
	public  void entermblnumbertxtbox(String mobilenumber) throws InterruptedException
	{
		
		EnterMobileNumber.sendKeys(mobilenumber);
	}
	@FindBy(id="com.samsung.android.contacts:id/cliv_name_textview")
	protected static WebElement SelectContact;
	public  void slectFromContact() throws InterruptedException
	{
		
		SelectContact.click();
	}
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/pick_contact_image")
	protected static WebElement ContactNumber;
	public  void slectFromYourNumber() throws InterruptedException
	{
		
		ContactNumber.click();
	}
	@FindBy(xpath="//*[contains(@text,'Select Service Type')]")
	protected static WebElement ServiceTypePopupHeader;
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/rc_ph_type_pre")
	protected static WebElement PrepaidOption;
	
	@FindBy(xpath="//*[contains(@text,'Postpaid')]")
	protected static WebElement PostPaidOptioninPopUP;
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/phoneTypeRadioPrepaid")
	protected static WebElement ServiceTypeRadio;
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/phoneTypeRadioPrepaid")
	protected static WebElement PrepadiRadio;
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/phoneTypeRadioPostpaid")
	protected static WebElement PostpadiRadio;
	
	public static  void selectPrepaidService(WebDriver driver) throws InterruptedException {
		
		
			WebDriverWait wait = new WebDriverWait(driver, 1);
			try {
			if (wait.until(ExpectedConditions.visibilityOf(ServiceTypePopupHeader)) != null) {
			Assert.assertTrue(ServiceTypePopupHeader.isDisplayed());
			
			PrepaidOption.click();
					}
				} catch (Exception e) {
					System.out.println("Element not present the pop up");
					PrepadiRadio.click();
			                    //do something if not present
					}
				
}
	public static  void selectPostpaidService(WebDriver driver) throws InterruptedException {
		
		
		WebDriverWait wait = new WebDriverWait(driver, 1);
		try {
		if (wait.until(ExpectedConditions.visibilityOf(ServiceTypePopupHeader)) != null) {
		Assert.assertTrue(ServiceTypePopupHeader.isDisplayed());
		
		PostPaidOptioninPopUP.click();
				}
			} catch (Exception e) {
				System.out.println("Element not present the pop up");
				PostpadiRadio.click();
		                    //do something if not present
				}
			
}
	
	@FindBy(className="android.widget.RadioButton")
	protected static WebElement selectFrmYurNumber;
	
	public  void selectFromYourNumber(String operator,String amount) throws InterruptedException 
	{
		 
		selectFrmYurNumber.click();
  }
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/lm_status_main_data")
	protected static WebElement byRecentRecharge;
	
	public void byRecentRecharge()
	{
		byRecentRecharge.click();
		
	}
}
