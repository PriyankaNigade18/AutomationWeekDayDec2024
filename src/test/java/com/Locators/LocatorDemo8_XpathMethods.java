package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathMethods {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//mobiles link- text()
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		

		//page count
//		String pageCount=driver.findElement(By.xpath("(//span[@class='a-carousel-page-count'])[1]")).getText();
//		System.out.println("Page count is: "+pageCount);
	
	
	
	}

}
