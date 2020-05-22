package com.rechargeautomation.base;

 import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.Assert;

	import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

import org.openqa.selenium.*;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
//import com.wibmo.generic.CommonMethods;
import com.rechargeautomation.screen.Login;


public class Setup {
	
	     public static AndroidDriver driver ;
	     Login login;
	     
	     public static ExtentReports extentreports;
	     public static ExtentTest extent_logger;
	     public static Properties prop;
	     FileInputStream fis=null;
	     public WebDriverWait wait;
	     
	     @BeforeSuite
	     public void initFramework()
	     {
	    	 
	    	 extentreports=new ExtentReports(System.getProperty("user.dir")+"./Report/"+Calendar.getInstance().getTimeInMillis()+".html");
	     }
	     
	     
	     @AfterSuite
	     public void closeFramework()
	     {
	    	 extentreports.endTest(extent_logger);
	    	 extentreports.flush();
	    	// driver.closeApp();
	    	
	    	 
	     }
	     
	     
	  @BeforeClass
	  
	  public void setup() 
	  {
		  prop=new Properties();
		  
		  try {
			fis=new FileInputStream(System.getProperty("user.dir")+"./Properties/Config.Properties");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
		try {
			prop.load(fis);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	    
	      DesiredCapabilities cap = new DesiredCapabilities();
	      cap.setCapability("deviceName",prop.getProperty("deviceName"));	
	      cap.setCapability("udid", prop.getProperty("udid"));
	      cap.setCapability("platformVersion", prop.getProperty("platformVersion"));
	      cap.setCapability("platformName",prop.getProperty("platformName"));
	      cap.setCapability("automationName", prop.getProperty("automationName"));
	      cap.setCapability("appPackage", prop.getProperty("appPackage"));
	      cap.setCapability("appActivity", prop.getProperty("appActivity"));
	      cap.setCapability("noReset", true);
	      
	      try {
			driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	     System.out.println("Initiating the Drivers ");
	     
         login=PageFactory.initElements(driver,Login.class);
	     
	     login.first();
	     login.second();
	     login.third();
	     login.fourth();
	     login.login();
	     
	  
	  }
	    
	  
	  @AfterClass
	  public void close()
	  {
		  try {
			fis.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		  
	  }
	
	  
	
	  }

	



