package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FreshWorksFooterAutomation {

	public static void main(String[] args) 
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.freshworks.com/");
		
		List<WebElement> allFooter=driver.findElements(By.xpath("//nav[contains(@class,'fMAcTI')]//div//ul//li//a"));

		System.out.println("Total Footers are: "+allFooter.size());
		
		for(WebElement i:allFooter)
		{
			System.out.println(i.getText());
		}
		
	}

}
