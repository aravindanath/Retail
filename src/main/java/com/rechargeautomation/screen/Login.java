package com.rechargeautomation.screen;

import io.appium.java_client.android.AndroidDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login  {
	 @FindBy(xpath="//*[@text='1']")
	 protected WebElement first;
	 public void first() 
	  {
		  first.click();
	  }
	 @FindBy(xpath="//*[@text='2']")
	 protected WebElement second;
	 public void second() 
	  {
		 second.click();
	  }
	 @FindBy(xpath="//*[@text='3']")
	 protected WebElement third;
	 public void third() 
	  {
		 third.click();
	  }
	 @FindBy(xpath="//*[@text='4']")
	 protected WebElement fourth;
	 public void fourth() 
	  {
		 fourth.click();
	  }
	 @FindBy(id="login_button")
	 protected WebElement login;
	  public void login()
  {		
	  login.click();
  }
	
		
  }

