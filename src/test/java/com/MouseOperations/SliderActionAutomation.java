package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SliderActionAutomation {
  @Test
  public void testSlider()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/slider/");
	  
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  //ele
	  WebElement ele=driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	  
	  
	  //action
	  Actions act=new Actions(driver);
	  act.clickAndHold(ele).moveToElement(ele,200,0).build().perform();
	  
	  
	  
	  
	  
	  
	  
  }
}
