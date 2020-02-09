package com.swaglabs.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import com.swaglabs.pageObjects.LogIn_Screen;
import com.swaglabs.pageObjects.Products_Screen;


public class TC_LogIn_001 extends BaseClass{

	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL);
		logger.info("URL Opened");
		
		LogIn_Screen ls = new LogIn_Screen(driver);
		ls.setUserName(username);
		ls.setPassword(password);
		logger.info("Entered UserName and Password");
		ls.clickLogIn();
		
		
		
		if (driver.findElement(By.xpath("//div[text()='Products']")).isDisplayed())
		{
			Assert.assertTrue(true);
			logger.info("LogIn Test Successful");
		}
		else
		{
			Assert.assertFalse(false);
			captureScreen(driver, "loginTest");
			logger.info("LogIn Failure");
		}
	}
	
	
	
	
	
}
