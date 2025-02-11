package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HowToAutomateWebElment {

	public static void main(String[] args)
	{
		//Create a driver session
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.google.com");
		/*
		//technique 2: Identify+ validate +perform action
		
		WebElement ele=driver.findElement(By.id("APjFqb"));
		
		if(ele.isDisplayed() && ele.isEnabled())
		{
			ele.sendKeys("Testng");
		}
		
		*/
		
		//technique 3: Identification + Perform action
		
		driver.findElement(By.id("APjFqb")).sendKeys("cucumber");
		
		
		/*
		//technique1: By Locator
		//get the address
		By searchBox=By.id("APjFqb");
		
		//identify it from selenium
		WebElement searchEle=driver.findElement(searchBox);
		
		//validate or perform action
		System.out.println("Is searchElement displayed?: "+searchEle.isDisplayed());
		System.out.println("Is SearchElement enabled?: "+searchEle.isEnabled());
		
		//action-type keyword-sendKeys()
		searchEle.sendKeys("Java",Keys.ENTER);
		
		*/
	}

}
