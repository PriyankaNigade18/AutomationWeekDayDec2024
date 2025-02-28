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
	 System.out.println("Total Headings are: "+allHeadings.size());//5
	 
	 int count=0;
	 for(WebElement i:allHeadings)
	 {
		 count++;
		 //System.out.println(i.getText());
		 if(i.getText().contains("CPU (%)"))
		 {
			 System.out.println("Position is: "+count);
			 //get the column data
			 List<WebElement> allData=driver.findElements(By.xpath("//tbody[@id='rows']//tr//td["+count+"]"));
			 for(WebElement j:allData)
			 {
				 System.out.println(j.getText());
				 
		 }
			 
			 
	 }
	
//	 
	 System.out.println("**************************");
	 
	 //get all browser name
	 List<WebElement> allNames=driver.findElements(By.xpath("//tbody[@id='rows']//tr//td[1]"));
	 for(WebElement i1:allNames)
	 {
		 System.out.println(i1.getText());
	 }
	 
	 System.out.println("**************************");
	 
	 //Number of rows
	 int rows=driver.findElements(By.xpath("//tbody[@id='rows']//tr")).size();
	 System.out.println("Number of rows are: "+rows);//4
	 
	 System.out.println("**************************");

	 //Number of column
	 List<WebElement> allCells=driver.findElements(By.xpath("//tbody[@id='rows']//tr[1]//td"));
	 System.out.println("Number of columns are: "+allCells.size());
	 
	 } 
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
	  
	  System.out.println("*******************");
	  //navigate to each page and get all data in console-Assignment
	  for(WebElement i:pages)
	  {
		  //open page
		  i.click();
		  
		  //get the data
		  List<WebElement> list=driver.findElements(By.xpath("//table[@id='productTable']//tbody//tr//td"));
		  for(WebElement k:list)
		  {
			  System.out.println(k.getText());
		  }
		  
		  
		  
	  }
	  
	  
	  System.out.println("**********************");
	  
	  //open page number 2 and for 	Television check the check box
	  
	  for(WebElement p:pages)
	  {
		  if(p.getText().contains("2"))
		  {
			  //open it
			  p.click();
			  driver.findElement(By.xpath("(//table[@id='productTable']//tbody//tr)[2]//td[text()='Television']//following-sibling::td//input[@type='checkbox']")).click();
		  }
	  }

  }
}
