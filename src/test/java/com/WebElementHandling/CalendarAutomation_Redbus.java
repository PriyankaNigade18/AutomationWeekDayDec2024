package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CalendarAutomation_Redbus {
  @Test
  public void testCalendar()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://www.redbus.in/");
	  
	  //open calendar
	  driver.findElement(By.xpath("//span[@class='dateText']")).click();
	  
	  //expectation
	  String edate="6";
	  String emonth="Dec";
	  String eyear="2025";
	  
	  //month selection
	  while(true)
	  {
	  //get the current month and year
	  String cdate=driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__Icon')])[2]")).getText();
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
		  //click on arrow till the consition match
		  driver.findElement(By.xpath("(//div[contains(@class,'DayNavigator__Icon')])[3]")).click();
	  }
	  
	  }
	  //date selection
	  
	  List<WebElement> allDates=driver.findElements(By.xpath("//div//div//span[contains(@class,'DayTiles__CalendarDays')]"));
	  
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
