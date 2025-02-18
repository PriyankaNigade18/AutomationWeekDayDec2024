package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchAutomation {

	public static void main(String[] args)
	{

		//create  driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		
		//search keyword
		driver.findElement(By.id("APjFqb")).sendKeys("cucumber");
		
		//get the list of options
		List<WebElement> list1=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		
		System.out.println("Total Options are: "+list1.size());
		
		for(WebElement i:list1)
		{
			System.out.println(i.getText());
		}
		
		
		

	}

}
