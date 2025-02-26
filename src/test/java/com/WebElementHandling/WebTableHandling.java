package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WebTableHandling
{
  @Test(priority=1)
  public void testStaticTable()
  {
	  
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 //get the heading
	 List<WebElement> allHeading=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[1]//th"));
	 System.out.println("total Headings are: "+allHeading.size());
	 for(WebElement i:allHeading)
	 {
		 System.out.println(i.getText());
	 }
	 
	 System.out.println("*****************************");
	 //Number of rows
	 int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).size();
	 System.out.println("Total rows in table: "+rows);//7
	 System.out.println("*****************************");

	//specific row-5th-index 4 row total=7 index =0 to 6
	 WebElement fifthRow=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr")).get(4);
	 System.out.println(fifthRow.getText());
	 
	 //Number columns
	 int cells=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr[2]//td")).size();
	 System.out.println("Total Number of cells : "+cells);//4
	 
	 //specific column- get all author name
	 List<WebElement> allAuthors=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[2]"));
	 
	 for(WebElement i:allAuthors)
	 {
		 System.out.println(i.getText());
	 }
	 
	 //get all price and calculate total price-assignment
	 
	 
	  //get all the data
	 List<WebElement> allData=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
	 for(WebElement i:allData)
	 {
		 System.out.println(i.getText());
	 }
	  
	  
  }
  
  
  @Test(priority=2)
  public void testDynamicTable()
  {
	  
	 WebDriver driver=new ChromeDriver();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://testautomationpractice.blogspot.com/");
	 
	 //get the headings
	 List<WebElement> allHeadings=driver.findElements(By.xpath("//tr[@id='headers']//th"));
	 System.out.println("Total Headings are: "+allHeadings.size());
	 for(WebElement i:allHeadings)
	 {
		 System.out.println(i.getText());
	 }
	 
	 System.out.println("**************************");
	 //get all browser name
	 List<WebElement> allNames=driver.findElements(By.xpath("//tbody[@id='rows']//tr//td[1]"));
	 for(WebElement i:allNames)
	 {
		 System.out.println(i.getText());
	 }
	 
	 
  }
  
  //@Test(priority=3)
  public void testPegination()
  {
	  System.out.println("This is atest()");
  }
}
