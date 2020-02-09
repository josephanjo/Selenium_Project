package com.swaglabs.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.swaglabs.pageObjects.LogIn_Screen;
import com.swaglabs.pageObjects.Products_Screen;

public class TC_AddItemsToCart_002 extends BaseClass {

	@Test
	public void AddItems() throws InterruptedException, IOException
	{
		
		Products_Screen ps = new Products_Screen(driver);
		ps.clickAddToCart_Onesie();
		ps.clickAddToCart_BikeLight();
		ps.clickShoppingCart();
		
		
		String s1=driver.findElement(By.xpath("//div[text()='Sauce Labs Onesie']")).getText();
		String s2=driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText();
		
	
		if (s1.contentEquals("Sauce Labs Onesie"))
		{
			Assert.assertEquals(s1, "Sauce Labs Onesie");
			logger.info("Sauce Labs Onesie is present in Shopping Cart");
		}
		else
		{
			captureScreen(driver, "AddItems");
			logger.info("Sauce Labs Onesie is NOT present in Shopping Cart");
		}
		
		if (s2.equals("Sauce Labs Bike Light"))
		{
			Assert.assertEquals(s2, "Sauce Labs Bike Light");
			logger.info("Sauce Labs Bike Light is present in Shopping Cart");
		}
		else
		{
			captureScreen(driver, "AddItems");
			logger.info("Sauce Labs Bike Light is NOT present in Shopping Cart");
		}
		
	}
	
}
