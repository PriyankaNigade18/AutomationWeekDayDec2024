package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InventoryPage
{
	private WebDriver driver;
	
	public InventoryPage(WebDriver driver)
	{
		this.driver=driver;
		
	}
	
	//locators
	private By product=By.xpath("//div[@class='inventory_list']//div[@class='inventory_item_name ']");
	private By cartButton=By.xpath("//button[text()='Add to cart']");
	private By cartPageOption=By.xpath("//a[@class='shopping_cart_link']");
	
	
	
	//methods
	
	public int getProductCount()
	{
		return driver.findElements(product).size();
	}
	
	
	public void getProductDetails()
	{
		List<WebElement> list=driver.findElements(product);
		System.out.println("**********Product details are*************");
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
	}
	
	
	public String addProductToCart(String pname)
	{
		List<WebElement> list=driver.findElements(product);
		
		for(WebElement i:list)
		{
			if(i.getText().contains(pname))
			{
				i.click();
				break;
			}
		}
		
		//add product to cart
		driver.findElement(cartButton).click();
		//System.out.println("Product added to cart: "+pname);
		return pname;
	}
	
	public void clickOnCartOption()
	{
		driver.findElement(cartPageOption).click();
	}

	
	public String launchCartPage()
	{
		driver.findElement(cartPageOption).click();
		return driver.getCurrentUrl();
		
	}

}
