package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FacebookDropdwon_SelectBased {
  @Test
  public void testDropdown()
  {
	  
	  //create  a driver session
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.facebook.com/");
	  
	  //open create new account page
	  driver.findElement(By.linkText("Create new account")).click();
	  
	  //day dropdown
	  WebElement dayEle=driver.findElement(By.id("day"));
	  
	  //select class object
	  Select daydd=new Select(dayEle);
	  
	  System.out.println("Is dropdown supports multiple selection?: "+daydd.isMultiple());
	  
	  //get the all options
	  List<WebElement> dayList=daydd.getOptions();
	  System.out.println("Total Options are: "+dayList.size());
	  
	  
	  for(WebElement i:dayList)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("29"))
		  {
			  System.out.println("Option found.....");
			  i.click();
			  break;
			  
		  }
	  }
	  
	  //select 29th Dec 2010
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
