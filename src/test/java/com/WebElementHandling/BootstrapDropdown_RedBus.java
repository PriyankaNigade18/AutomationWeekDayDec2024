package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BootstrapDropdown_RedBus 
{
  @Test
  public void testRedbBusDropdown() 
  {
	  
	  //create  driver session
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //from dropdown
	  WebElement ddele=driver.findElement(By.id("src"));
	  ddele.click();
	  ddele.sendKeys("Pune");
	  
	  String exp="Kharadi";
	  
	  //get the list of options
	  List<WebElement> allOptions=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq dZhbJF']//li//text[@class='placeHolderMainText']"));
	  System.out.println("Total Elements are: "+allOptions.size());
	  for(WebElement i:allOptions)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains(exp))
		  {
			  System.out.println("Match found!");
			  i.click();
			  break;
			  
			  
		  }
	  }
	  
	  
	  //automate To dropdown for redbus
	  
	  
	  
	  
  }
}
