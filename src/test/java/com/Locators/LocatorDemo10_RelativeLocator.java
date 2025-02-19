package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorDemo10_RelativeLocator {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		//get the customer service and identify search which is right side of customer service
		
		//customer service
		WebElement ele1=driver.findElement(By.linkText("Customer Service"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toRightOf(ele1)).sendKeys("watch");
		
		
		//get the link and interact left side ele which is search
		
		WebElement ele2=driver.findElement(By.linkText("Sign In"));
		
		WebElement search=driver.findElement(RelativeLocator.with(By.xpath("//input[@placeholder='Search']")).toLeftOf(ele2));
		search.clear();
		search.sendKeys("bags");
		
		
	
		
		
		
		
		
		
	}

}
