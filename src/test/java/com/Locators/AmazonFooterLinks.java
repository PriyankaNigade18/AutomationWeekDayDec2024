package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFooterLinks {

	public static void main(String[] args) 
	{
		//create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in");
		
		List<WebElement> footerList=driver.findElements(By.xpath("//div[contains(@class,'navFooterVerticalRow')]//div//ul//li"));
		System.out.println("Total Footer links are: "+footerList.size());
		
		for(WebElement i:footerList)
		{
			System.out.println(i.getText());
		}
		
	}

}
