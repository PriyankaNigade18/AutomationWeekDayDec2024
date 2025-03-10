package com.MouseOperations;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseOverAction {
  @Test
  public void testMouseOver() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	  driver.get("https://www.naukri.com/");
	  
	  //job
	  WebElement ele=driver.findElement(By.xpath("//div[text()='Jobs']"));
	  
	  //mouse over-->moveToElement()
	  Actions act=new Actions(driver);
	  act.moveToElement(ele).perform();
	  
	  //list of links
	  List<WebElement> list=driver.findElements(By.xpath("//div[contains(@class,'nI-gNb-Jobs')]//ul//li//a//div"));
	  
	  for(WebElement i:list)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
