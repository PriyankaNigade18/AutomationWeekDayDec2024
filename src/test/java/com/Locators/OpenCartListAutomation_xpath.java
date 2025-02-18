package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCartListAutomation_xpath {

	public static void main(String[] args)
	{
		// create driver session
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

		//get the list
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='list-group']//a"));
		System.out.println("Total Options are: "+list.size());
		
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		
	}

}
