package com.Capabilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class HeadlessBrowserTesting {
  @Test
  public void testHeadless()
  {				
	  		//set the capabilities
	  		ChromeOptions options=new ChromeOptions();
	  		options.addArguments("--headless");
	  
	  
	  		//create  driver session
			WebDriver driver=new ChromeDriver(options);
			System.out.println("Driver session created!");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.google.com/");
			
			System.out.println("Google Application Launch.....");
			//search keyword
			driver.findElement(By.id("APjFqb")).sendKeys("cucumber");
			System.out.println("Search for valid Keyword Cucumber");
			
			//get the list of options
			List<WebElement> list1=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
			
			System.out.println("Total Options are: "+list1.size());
			
			for(WebElement i:list1)
			{
				System.out.println(i.getText());
			}
			
			System.out.println("For keyword options are printed!");
  }
}
