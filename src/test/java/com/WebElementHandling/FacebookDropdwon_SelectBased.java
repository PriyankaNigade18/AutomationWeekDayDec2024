package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class FacebookDropdwon_SelectBased
{
//	public static void selectBasedDropdown(WebElement ele,String value)
//	{
//		 //select class object
//		  Select dd=new Select(ele);
//		  
//		  System.out.println("Is dropdown supports multiple selection?: "+dd.isMultiple());
//		  
//		  //get the all options
//		  List<WebElement> allOptions=dd.getOptions();
//		  System.out.println("Total Options are: "+allOptions.size());
//		  
//		  
//		  for(WebElement i:allOptions)
//		  {
//			  System.out.println(i.getText());
//			  if(i.getText().contains(value))
//			  {
//				  System.out.println("Option found.....");
//				  i.click();
//				  break;
//				  
//			  }
//		  }
//	}
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
	  Utility.selectBasedDropdown(dayEle,"27");
	  
	  //month dropdown
	  WebElement monthEle=driver.findElement(By.id("month"));
	  Utility.selectBasedDropdown(monthEle,"Dec");
	  
	  //year dropdown
	  WebElement yearEle=driver.findElement(By.id("year"));
	  Utility.selectBasedDropdown(yearEle,"2010");
	  
	  
	  
//	  //select class object
//	  Select daydd=new Select(dayEle);
//	  
//	  System.out.println("Is dropdown supports multiple selection?: "+daydd.isMultiple());
//	  
//	  //get the all options
//	  List<WebElement> dayList=daydd.getOptions();
//	  System.out.println("Total Options are: "+dayList.size());
//	  
//	  
//	  for(WebElement i:dayList)
//	  {
//		  System.out.println(i.getText());
//		  if(i.getText().contains("29"))
//		  {
//			  System.out.println("Option found.....");
//			  i.click();
//			  break;
//			  
//		  }
//	  }
	  /*
	  //select 29th Dec 2010
	  //month dropdown
	  WebElement monthEle=driver.findElement(By.id("month"));
	  Select monthdd=new Select(monthEle);
	  System.out.println("Is dropdown support multiple selection: "+monthdd.isMultiple());
	  
	  
	  List<WebElement> list=monthdd.getOptions();
	  System.out.println("Total Options are: "+list.size());
	  
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("Dec")) {
			  i.click();
		  }
	  }
	  
	  */
	  
	  //year dropdown
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
