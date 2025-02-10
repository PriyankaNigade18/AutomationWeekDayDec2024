package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args)
	{
		//ctrl+shift+O
		
		// create a driver session
		WebDriver driver=new ChromeDriver();
		
		//get(url):void
		//InvalidArgumentException: invalid argument(Invalid URL)
		//driver.get("www.google.com");
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//getTitle():String
		System.out.println("Title is: "+driver.getTitle());
		
		
		//getCurrentUrl():String
		System.out.println("Current Url: "+driver.getCurrentUrl());
		
		//getPageSource():string
		System.out.println(driver.getPageSource());
		
		//close()/quit(): close the window
		//driver.close();
		driver.quit();
		
		
		
		
		
		
		
		

	}

}
