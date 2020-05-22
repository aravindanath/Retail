package com.rechargeautomation.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.rechargeautomation.base.Setup;

import io.appium.java_client.android.AndroidDriver;

public class CommonMethods  {
	Setup setup=new Setup();
	 @SuppressWarnings("rawtypes")
  	  public static WebElement scroll(WebDriver driver,String text) 
  	  {
  	             
  	     String scrollable="new UiScrollable(new UiSelector()).scrollIntoView(new UiSelector().textContains(\""+text+"\"))"; 

  	     return ((AndroidDriver)driver).findElementByAndroidUIAutomator(scrollable);
  	     
  	  }
}
