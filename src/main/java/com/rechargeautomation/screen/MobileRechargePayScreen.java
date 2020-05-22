package com.rechargeautomation.screen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.rechargeautomation.base.Setup;
import com.rechargeautomation.generic.CommonMethods;

import io.appium.java_client.android.AndroidDriver;

public class MobileRechargePayScreen  {
	
	@FindBy(id="com.enstage.wibmo.staging.hdfc:id/operatorSpinner")
	protected WebElement operatorDrpdwn;
	public void clickOperatorDrpDwn() 
	  {
		operatorDrpdwn.click();
	  }
	@FindBy(className="android.widget.CheckedTextView")
	protected WebElement PresentOperator;
	
public  void SelectOperator(WebDriver driver,String operator) throws InterruptedException{
	
String ActualOperator = PresentOperator.getText();
		if (ActualOperator.equals(System.getProperty(operator))) {
			System.out.println("Operator Selected is correct");
			//System.out.println("PASSED: Operator Selection");
		} else {
			System.out.println("Operator IS INVALID");
			CommonMethods.scroll(driver, operator).click();
			}
}
    @FindBy(id="com.enstage.wibmo.staging.hdfc:id/input_amount")
	protected WebElement Amount;
    
    public void Amount(String amount){
    	Amount.sendKeys(amount);
    	}
    
    @FindBy(id="com.enstage.wibmo.staging.hdfc:id/main_btn_pay")
	public static WebElement Pay;
   
    	public void Pay() 
    	{
    		Pay.click();
    		
    	}
    	
}
