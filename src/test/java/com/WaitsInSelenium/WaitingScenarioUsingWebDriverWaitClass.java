package com.WaitsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class WaitingScenarioUsingWebDriverWaitClass {
  @Test
  public void testExplicitWait() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://the-internet.herokuapp.com/dynamic_loading/2");
	  
	  boolean urlStatus=Utility.waitForUrlContains(driver,"https");
	  System.out.println("Valid url with protocol: "+urlStatus);
	  
	  boolean titleStatus=Utility.waitForTitleContains(driver,"Internet");
	  System.out.println("Valid title status is: "+titleStatus);
	  
	  By startBtn=By.tagName("button");
	  By textEle=By.xpath("(//h4)[2]");
	  
	  
	  driver.findElement(startBtn).click();
	  
	  String text=Utility.waitForVisibilityOfElement(driver,textEle).getText();
//	  String text=driver.findElement(textEle).getText();
 	  System.out.println(text);
	  
	  
	  
	  
	  
	  
	  
  }
}
