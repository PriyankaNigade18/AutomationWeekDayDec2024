package com.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo2_Id_Name {

	public static void main(String[] args)
	{
		//create  driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://automationplayground.com/crm/");
		
		//signin
		driver.findElement(By.linkText("Sign In")).click();
		
		//login
		//email
		driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
		
		//password
		driver.findElement(By.name("password-name")).sendKeys("test123");
		
		//checkbox-Remember me
		driver.findElement(By.id("remember")).click();
		
		//submit
		//InvalidSelectorException: Compound class names not permitted
		//driver.findElement(By.className("btn btn-default btn-primary"));
		
		driver.findElement(By.className("btn")).click();
		

	}

}
