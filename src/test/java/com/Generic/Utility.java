package com.Generic;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Utility
{
	
	
	public static void getScreenshot(WebDriver driver,String filename)
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		String cdate=sdf.format(date);
		
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp= ts.getScreenshotAs(OutputType.FILE);
	  //File dest=new File(System.getProperty("user.dir")+"//Screenshots//Amazon"+System.currentTimeMillis()+".png");
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//"+filename+cdate+".png");
	  
	  try {
		FileHandler.copy(temp,dest);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	
	
	public static void selectBasedDropdown(WebElement ele,String value)
	{
		 //select class object
		  Select dd=new Select(ele);
		  
		  System.out.println("Is dropdown supports multiple selection?: "+dd.isMultiple());
		  
		  //get the all options
		  List<WebElement> allOptions=dd.getOptions();
		  System.out.println("Total Options are: "+allOptions.size());
		  
		  
		  for(WebElement i:allOptions)
		  {
			  System.out.println(i.getText());
			  if(i.getText().contains(value))
			  {
				  System.out.println("Option found.....");
				  i.click();
				  break;
				  
			  }
		  }
	}
	
	//javascriptexecutor
	public static void scrollDown(WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		  
	}

	public static void scrollUp(WebDriver driver)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
		  
	}
	public static void scrollUpToElement(WebDriver driver,WebElement ele)
	{
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("arguments[0].scrollIntoView(true);",ele);
		  
	}
	//explicit Wait
	
	public static WebElement waitForPresenceOfElement(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.presenceOfElementLocated(loc));
		  
	}
	
	public static WebElement waitForVisibilityOfElement(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.visibilityOfElementLocated(loc));
		  
	}
	
	public static WebElement waitForElementToClickable(WebDriver driver,By loc)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.elementToBeClickable(loc));
		  
	}
	
	public static boolean waitForUrlContains(WebDriver driver,String url)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.urlContains(url));
		  
	}
	
	
	public static boolean waitForTitleContains(WebDriver driver,String title)
	{
		 WebDriverWait wait1=new WebDriverWait(driver,Duration.ofSeconds(5));
		 return wait1.until(ExpectedConditions.titleContains(title));
		  
	}
	
	
}
