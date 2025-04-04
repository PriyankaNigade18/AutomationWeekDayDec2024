package com.TestNG.screenshots;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotTest 
{
	public String getDate()
	{
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
		String cdate=sdf.format(date);
		return cdate;
		
	}
	
	
  @Test
  public void TestScreenshot() throws IOException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  
	  	Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy-HH mm ss");
		String cdate=sdf.format(date);
		
	  TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp= ts.getScreenshotAs(OutputType.FILE);
	  //File dest=new File(System.getProperty("user.dir")+"//Screenshots//Amazon"+System.currentTimeMillis()+".png");
	  File dest=new File(System.getProperty("user.dir")+"//Screenshots//Amazon_"+cdate+".png");
	  
	  FileHandler.copy(temp,dest);
	  
	  
	  
	  
  }
}
