package com.Locators;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo4_tagName {

	public static void main(String[] args) 
	{

		//create a driver session
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		
		//number of text boxes
		
		List<WebElement> inputBoxes=driver.findElements(By.tagName("input"));
		System.out.println("Total TextBoxes are: "+inputBoxes.size());
		
		
		//number of images
		int images=driver.findElements(By.tagName("img")).size();
		System.out.println("Total Images are: "+images);
		
		//number of links
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		System.out.println("Total links are: "+allLinks.size());
		
		for(WebElement i:allLinks)
		{
			//System.out.println(i.getAttribute(null)); deprecated
			
			System.out.println(i.getDomAttribute("href"));
			System.out.println("Text is: "+i.getText());
		}
		
		
		
		

	}

}
