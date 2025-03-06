package com.specialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SVGElementautomation_testAutomationPage {
  @Test
  public void testSVG() 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  List<WebElement> svgEle=driver.findElements(By.xpath("//*[name()='svg']//child::*"));
	  
	  System.out.println("Total svg Elements are: "+svgEle.size());
	  
	  for(WebElement i:svgEle)
	  {
		  System.out.println("shape is: "+i.getTagName());
		  System.out.println("Color is: "+i.getDomAttribute("fill"));
	  }
	  
	  
	  
	  
	  
	  
	  
  }
}
