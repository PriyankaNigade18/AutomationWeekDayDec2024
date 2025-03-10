package com.MouseOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ResizeElementAction {
  @Test
  public void testResize()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/resizable/");
	  
	  //frame
	  driver.switchTo().frame(0);
	  
	  WebElement ele=driver.findElement(By.xpath("//div[contains(@class,'ui-icon')]"));
	  
	  
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).dragAndDropBy(ele,90,70).build().perform();
	  
	  
	  
  }
}
