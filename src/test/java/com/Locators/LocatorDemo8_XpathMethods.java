package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo8_XpathMethods {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//fashion page-ElementNotInteractableException: element not interactable
		driver.findElement(By.xpath("//a[text()='Fashion']")).click();	
		
		//women 
		driver.findElement(By.xpath("//span[normalize-space()='Women']")).click();
		
		//open cart page
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']//span[normalize-space()='Cart']")).click();
		
		//get the cart message
		String text=driver.findElement(By.xpath("(//h3)[1]")).getText();
		System.out.println("Cart message: "+text);
		
		
		//search functionality
		driver.findElement(By.xpath("//input[contains(@id,'searchtext')]")).sendKeys("watch",Keys.ENTER);
		
		//clear the text and search for other product
		WebElement ele=driver.findElement(By.xpath("//input[starts-with(@id,'two')]"));
		
		ele.clear();
		ele.sendKeys("bags",Keys.ENTER);
		
		
		//mobiles link- text()
		//driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
		

		//Best Seller-page count
//		String pageCount=driver.findElement(By.xpath("(//span[@class='a-carousel-page-count'])[1]")).getText();
//		System.out.println("Page count is: "+pageCount);
	
	
	
	}

}
