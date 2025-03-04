package com.javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class JavascriptFunctionsDemo {
  @Test
  public void testJavascriptFunctions() throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/"); 
	  
	  JavascriptExecutor js=(JavascriptExecutor) driver;
	  
	  
	  //get the title- getTitle
	  System.out.println(driver.getTitle());
	  
	  //get the title using js
	  String title=js.executeScript("return document.title").toString();
	  System.out.println(title);
	  
	  //to refresh page
	  driver.navigate().refresh();
	  
	  Thread.sleep(3000);
	  //to refresh page using js
	  js.executeScript("window.history.go()");
	  
	  //click on element
	  //driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]")).click();
	  
	  WebElement ele=driver.findElement(By.xpath("(//span[normalize-space()='Cart'])[2]"));
	  //click on element using js
	  js.executeScript("arguments[0].click()",ele);
	  
	  
	  
	  
	  
	  
	  
	 
	  
  }
}
