package com.TestNG.DataPassing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Generic.PropertiesUtil;

public class HrmLoginScenarioUsingPropertiesFile {
  @Test
  public void testLogin() 
  {
	  
	  PropertiesUtil prop=new PropertiesUtil("config");
	  
	    
	  WebDriver driver=new ChromeDriver();
	    
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get(prop.getData("url"));
	  
	  driver.findElement(By.name("username")).sendKeys(prop.getData("un"));
	  driver.findElement(By.name("password")).sendKeys(prop.getData("psw"));
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
  }
}
