package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calendarautomation_Goibibo {
  @Test
  public void testCalendar() 
  {
	  
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.goibibo.com/");
	  
	  driver.manage().window().maximize();
	  //close the popup
	  driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
	  
	  //open calendar
	  driver.findElement(By.xpath("(//span[contains(@class,'sc-12foipm-8')])[1]")).click();
	  
	  //expectation
	  String edate="6";
	  String emonth="July";
	  String eyear="2025";
	  
	  //month selection
	  while(true)
	  {
	  //get the current month and year
	  String cdate=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
	  System.out.println(cdate);
	  
	  String cmonth=cdate.split(" ")[0];
	  String cyear=cdate.split(" ")[1];
	  
	  System.out.println(cmonth+ " : "+cyear);
	  if(cmonth.contains(emonth) && cyear.contains(eyear))
	  {
		  System.out.println("Month selected....");
		  break;
	  }else
	  {
		  //click on arrow till the condition match
		  driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
	  }
	  
	  }
	  
	  //date selection
	  
	  List<WebElement> allDates=driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]//div[@class='DayPicker-Day']"));
	  
	  for(WebElement i:allDates)
	  {
		  if(i.getText().contains(edate))
		  {
			  i.click();
			  break;
		  }
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
