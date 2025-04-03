package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P3_Cart
{

	private WebDriver driver;
	
	public P3_Cart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//loactors
	@FindBy(xpath="//div[@class='inventory_item_name']")
	WebElement itemName;
	
	@FindBy(xpath="//button[text()='Remove']")
	WebElement removeButton;
	
	@FindBy(id="continue-shopping")
	WebElement continueButton;
	
	@FindBy(id="checkout")
	WebElement checkoutButton;
	
	
	//Methods
	public String getCartProductDetails()
	{
		//System.out.println("Product added in Cart: "+itemName.getText());
		return itemName.getText();
	}
	
	
	public P3_Cart removeProduct()
	{
		String text=itemName.getText();
		removeButton.click();
		System.out.println("Product remove from cart: "+text);
		return this;
		
	}
	
	
	public P2_Inventory doContinueShopping()
	{
		continueButton.click();
		return new P2_Inventory(driver);
		
	}
	
	public P4_CheckOut openCheckoutPage()
	{
		checkoutButton.click();
		return new P4_CheckOut(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
