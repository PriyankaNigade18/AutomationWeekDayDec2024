package com.specialScenario;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SVGElementAutomation_Orangehrm {
  @Test
  public void testSVG()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  //test liks
	  /*
	  List<WebElement> list=driver.findElements(By.tagName("a"));
	  System.out.println("Total links are: "+list.size());
	  
	  for(WebElement i:list)
	  {
		  i.click();
		  break;
	  }
	  */
	  
	  //get the total svg elements-->svg interaction
	  List<WebElement> svgEle=driver.findElements(By.xpath("//*[name()='svg']"));
	  
	  System.out.println("Total SVG Elements are: "+svgEle.size());
	
	  int count=0;
	  for(WebElement i:svgEle)
	  {
		  count++;
		  if(count==3)
		  {
			  i.click();
			  break;
		  }
		  
	  }
	  
	
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
