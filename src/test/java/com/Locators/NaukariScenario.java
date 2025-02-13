package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaukariScenario {

	public static void main(String[] args) 
	{
		// Create  a driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());
		
		String exp="https://resume.naukri.com/job-letter-format";
		
		for(WebElement i:allLinks)
		{
			System.out.println(i.getText());
			System.out.println(i.getDomAttribute("href"));
			try {
			if(i.getDomAttribute("href").contains(exp))
			{
				
				System.out.println("Link found...Test Pass!");
				break;
			}}catch(Exception s)
			{
			System.out.println("href attribute is not present for link!");	
			}
		}
		
		
		
		
		
		
		

	}

}
