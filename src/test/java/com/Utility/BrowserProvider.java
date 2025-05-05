package com.Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BrowserProvider
{
	/*
	 * ThreadLocal is a class and help you to create same Local variable 
	 * that you can use in current project 
	 * 
	 * This class have two method
	 * --------------------------
	 * set(): to set the variable
	 * get(): to get the variable
	 */
	
	static public WebDriver driver;
	
	//creating WebDriver type thread/variable
	static ThreadLocal<WebDriver> tdriver=new ThreadLocal<WebDriver>();
	
	
	public static WebDriver setDriver(String bname)
	{
		if(bname.equals("chrome"))
		{
		driver=new ChromeDriver();
		tdriver.set(driver);
		}else if(bname.equals("edge"))
		{
			driver=new EdgeDriver();
			tdriver.set(driver);
		}
		
			return getDriver();
	}
	
	public static WebDriver getDriver()
	{
		//capable to return current driver 
		return tdriver.get();
		
	}
	
	
}
