package com.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class ScrollDemo {
  @Test
  public void testScrollForWebPage() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/"); 
	  
	  
	  Utility.scrollDown(driver);
	  Thread.sleep(3000);
	  Utility.scrollUp(driver);
	  
	  
	  
//	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Sports')]"));
	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'No cost EMI up to 24 months ')]"));
	  
	  Utility.scrollUpToElement(driver,ele);
	  
	  
//	  //converted webdriver object into javascript
//	  JavascriptExecutor js=(JavascriptExecutor) driver;
//	  //scroll the page upto some webelement
//	  WebElement ele=driver.findElement(By.xpath("//span[contains(text(),'Best Sellers in Sports')]"));
//	  js.executeScript("arguments[0].scrollIntoView(true);",ele);
//	  
	  
	  /*
	 
	  //js.executeScript("window.scrollTo(0,5000)");
	  
	  js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
	  Thread.sleep(2000);
	  //scrollUp
	  js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	  */
	  
	  
	  
	  
	  
  }
}
