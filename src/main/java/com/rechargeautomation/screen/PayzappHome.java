package com.rechargeautomation.screen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PayzappHome {

	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/image_bill_pay")
	protected WebElement RechargeIcon;


	public  void ClickOnRechargeIcon()
	{ 
		RechargeIcon.click();	
	}
}
