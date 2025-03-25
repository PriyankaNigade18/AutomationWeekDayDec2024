package com.SwagLab.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;

public class BaseClass 
{
	
	public WebDriver driver;
	public P1_Login lp;
	public P2_Inventory ip;
	
	@BeforeClass
	@Parameters({"bname"})
	public void setUp(String bname)
	{
		switch(bname)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
	    case "firefox": driver=new FirefoxDriver();break;
		default: return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/");
		lp=new P1_Login(driver);
		ip=new P2_Inventory(driver);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
