package com.WebElementHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
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
	 
	 List<WebElement> allPrice=driver.findElements(By.xpath("//table[@name='BookTable']//tbody//tr//td[4]"));	 
	
	 int total=0;
	 for(WebElement i:allPrice)
	 {
		 System.out.println(i.getText());
		 //string-->int
		 String data=i.getText();
		 int price=Integer.parseInt(data);
		 total=total+price;
	 }
	 
	 System.out.println("Total Book price is: "+total);
	 
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
	 int count=0;
	 
	 for(WebElement i:allHeadings) {
		 
		 count++;
		 if(i.getText().contains("Memory (MB)"))
		 {
			 System.out.println(i.getText());
			 System.out.println(count);
			 List<WebElement> data=driver.findElements(By.xpath("//table[@id='taskTable']//tbody//tr//td["+count+"]"));
			 for(WebElement k:data)
			 {
				 System.out.println(k.getText());
			 }
		 }
		 
		
	 }
	 

	 
	 //System.out.println("Position is: "+count);
//	 for(WebElement i:allHeadings)
//	 {
//		
//		 System.out.println(i.getText());
//		 if(i.getText().contains("Memory (MB)"))
//		{
//			 
//		}
//	 }
//	 
	 System.out.println("**************************");
	 /*
	 //get all browser name
	 List<WebElement> allNames=driver.findElements(By.xpath("//tbody[@id='rows']//tr//td[1]"));
	 for(WebElement i:allNames)
	 {
		 System.out.println(i.getText());
	 }
	 
	 System.out.println("**************************");
	 
	 //Number of rows
	 int rows=driver.findElements(By.xpath("//tbody[@id='rows']//tr")).size();
	 System.out.println("Number of rows are: "+rows);//4
	 
	 System.out.println("**************************");

	 //Number of column
	 List<WebElement> allCells=driver.findElements(By.xpath("//tbody[@id='rows']//tr[1]//td"));
	 System.out.println("Number of columns are: "+allCells.size());//
//	 for(WebElement i:allCells)
//	 {
//		 System.out.println(i.getText());
//	 }
//	 int count=1;
//	 for(WebElement i:allCells)
//	 {
//		 
//		 if(i.getText().contains("Memory (MB)"))
//		 {
//			count++;
//		 }
//		 
//		 System.out.println("count is: "+count);
//	 }
//	 
//	 System.out.println("count is: "+count);
	 
//	 WebElement cnumber=null;
//	 for(int i=0;i<allCells.size();i++)
//	 {
//		 
//		allCells.get(i);
//	
//
//	 }
//	 System.out.println("Column number is: "+cnumber.getText());
//	 
	 
	 
	 System.out.println("**************************");
/*
	 //memory column data
	 List<WebElement> allMemory=driver.findElements(By.xpath("//tbody[@id='rows']//tr//td[3]"));
	 
	 for(WebElement i:allMemory)
	 {
		 System.out.println(i.getText());
	 }
	 System.out.println("**************************");

	 List<WebElement> alltd=driver.findElements(RelativeLocator.with(By.xpath("//tbody[@id='rows']//tr//td")).below(By.xpath("//tr[@id='headers']//th[text()='Memory (MB)']")));
	 
	 for(WebElement i:alltd)
	 {
		 System.out.println(i.getText());
	 }
	 
	 */
	 
	 
  }
  
  @Test(priority=3)
  public void testPegination()
  {
	 
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	 List<WebElement> headings=driver.findElements(By.xpath("//table[@id='productTable']//th"));
	  System.out.println("Number of headings are: "+headings.size());//4
	  
	  for(WebElement i:headings)
	  {
		  System.out.println(i.getText());
	  }
	  
	  
	  System.out.println("**********************");
	  
	  int rows=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr")).size();
	  System.out.println("Number of rows are: "+rows);//5
	  
	  System.out.println("**********************");
	  //Number of pages in table
	  
	 List<WebElement> pages=driver.findElements(By.xpath("//ul[@id='pagination']//li//a"));
	  System.out.println("Number of pages are: "+pages.size());//4
	  System.out.println("**********************");
	  //for page number 3 get the name of all the product
	  for(WebElement i:pages)
	  {
		  System.out.println(i.getText());
		  if(i.getText().contains("3"))
		  {
			  i.click();//open the page
			  List<WebElement> products=driver.findElements(By.xpath("//table[@id='productTable']//tbody/tr/td[2]"));
			  for(WebElement j:products)
			  {
				  System.out.println(j.getText());
			  }
		  }
	  }
	  
	  //navigate to each page and get all data in console-Assignment
	  
	  
	  
	  

  }
}
