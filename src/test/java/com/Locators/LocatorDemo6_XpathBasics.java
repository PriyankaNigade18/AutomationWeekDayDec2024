package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo6_XpathBasics {

	public static void main(String[] args)
	{

		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//login functionality
		
		//username
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		
		//password
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
		
		//login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
