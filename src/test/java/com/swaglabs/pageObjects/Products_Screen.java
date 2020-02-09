package com.swaglabs.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Products_Screen {

WebDriver ldriver;
	
	public Products_Screen(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
//	@FindBy(xpath="//div[text()='Products']")
//	@CacheLookup
//	WebElement productsLabel;
	
	@FindBy(xpath="//div[contains(text(),'Onesie')]//parent::a[@id='item_2_title_link']//parent::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']//button[@class='btn_primary btn_inventory']")
	@CacheLookup
	WebElement onesie_AddToCart;
	
	@FindBy(xpath="//div[text()='Sauce Labs Bike Light']//parent::a[@id='item_0_title_link']//parent::div[@class='inventory_item_label']//following-sibling::div[@class='pricebar']//button[@class='btn_primary btn_inventory']")
	@CacheLookup
	WebElement bikelight_AddToCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link fa-layers fa-fw']//*[name()='svg']")
	@CacheLookup
	WebElement shoppingCart;
	
//	public void productsLabelVerify()
//	{
//		if (productsLabel.isDisplayed()) System.out.println("Login Success");
//		else System.out.println("Log In Failure");
//	}
	
	public void clickAddToCart_Onesie()
	{
		onesie_AddToCart.click();
	}	
	
	public void clickAddToCart_BikeLight()
	{
		bikelight_AddToCart.click();
	}	
	
	public void clickShoppingCart()
	{
		shoppingCart.click();
	}	
}
