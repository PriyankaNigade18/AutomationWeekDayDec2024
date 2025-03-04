package com.Generic;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utility
{
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
}
