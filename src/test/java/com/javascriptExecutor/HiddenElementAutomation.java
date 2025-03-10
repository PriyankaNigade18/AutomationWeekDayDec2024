package com.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElementAutomation {
  @Test
  public void testHiddenElement() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.letskodeit.com/practice");
	  
	  
	  driver.findElement(By.id("hide-textbox")).click();
	  
	  //textbox will hide
	  //driver.findElement(By.id("displayed-text")).sendKeys("Hello All");
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  js.executeScript("document.getElementById('displayed-text').value='Hello all!';");
	  
	  
	  
	  
	  
  }
}
