package com.AppTesting.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;

public class MobileElement 
{

	public static void getScreenshot(AppiumDriver driver,String name)
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(System.getProperty("user.dir")+"//AllScreenshots//"+name+".png");
		
		try {
			FileHandler.copy(src,dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static void scrollDown(AppiumDriver driver,WebElement pageArea)
	{
		driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)pageArea).getId(),
				  "direction","down",
				  "percent",1.0
				  
				  
				  ));
	}
	
	public static void scrollAsPerUserChoice(AppiumDriver driver,WebElement pageArea,int count,String direction)
	{
		for(int i=1;i<=count;i++)
		{
		driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)pageArea).getId(),
				  "direction",direction,
				  "percent",1.0
				  
				  
				  ));
		System.out.println("Scroll Iteration: "+i);
		}
	}
	
	
	
	public static void scrollUp(AppiumDriver driver,WebElement pageArea)
	{
		driver.executeScript("mobile:scrollGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)pageArea).getId(),
				  "direction","up",
				  "percent",1.0
				  
				  
				  ));
	}
	
	
	
	public static void swipeLeft(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","left",
				  "percent",1.0
				   
				  ));
		  
	}
	
	
	public static void swipeRight(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","right",
				  "percent",1.0
				   
				  ));
		  
	}
	
	public static void swipeDown(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","down",
				  "percent",1.0
				   
				  ));
		  
	}
	
	
	public static void swipeUp(AppiumDriver driver,WebElement area)
	{
		driver.executeScript("mobile:swipeGesture",ImmutableMap.of(
				  
				  "elementId",((RemoteWebElement)area).getId(),
				  "direction","up",
				  "percent",1.0
				   
				  ));
		  
	}
	
}
