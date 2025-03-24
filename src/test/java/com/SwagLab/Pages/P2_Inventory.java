package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P2_Inventory 
{
	private WebDriver driver;
	
	public P2_Inventory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	//locators
	
	@FindBy(xpath="//div//div[@class='inventory_item_name ']")
	List<WebElement> allProducts;
	
	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement addToCartButton;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement cartOption;
	
	//actions
	
	public int getProductCount()
	{
		return allProducts.size();
	}
	
	public P2_Inventory getProductDetails()
	{
		System.out.println("Product details are:");
		
		for(WebElement i:allProducts)
		{
			System.out.println(i.getText());
		}
		return this;
	}
	
	public P2_Inventory addProductToCart(String pname)
	{
		
		for(WebElement i:allProducts)
		{
			if(i.getText().contains(pname))
			{
				System.out.println("Product found in List: "+pname);
				i.click();
				break;
			}
		}
		
		//click on add to cart button
		
		addToCartButton.click();
		System.out.println("Product added to cart: "+pname);
		return this;
	}
	
	public P3_Cart openCartPage()
	{
		cartOption.click();
		//navigating to cart page
		return new P3_Cart();
	}
	
	
	
	

}
