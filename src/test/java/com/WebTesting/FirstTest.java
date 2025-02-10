package com.WebTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) 
	{
		// Create a driver session
		WebDriver driver=new ChromeDriver();
		//get()
		driver.get("https://www.google.com");
		
		//title of page-getTitle()
		
		String actTitle=driver.getTitle();
		System.out.println("Title is: "+actTitle);
		
		//validation
		String expTitle="Google";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Title matched....Test Pass!");
		}else
		{
			System.out.println("Title not matched...Test Fail!");
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
