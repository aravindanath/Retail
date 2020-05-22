package com.rechargeautomation.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RechargeHome{
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/image_mobile")
	protected static WebElement mobile;
	
	public  void ClickOnMobileIcon()
	{ 
		mobile.click();	
	}
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/image_dth")
	protected WebElement DTHIcon;
	
	public  void  DTHIcon(WebDriver driver) 
	{
	    DTHIcon.click();
	}
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/image_datacard")
	protected static WebElement DataCardIcon;
	
	public static  void  DataCardIcon(WebDriver driver) 
	{
		DataCardIcon.click();
	}
}
