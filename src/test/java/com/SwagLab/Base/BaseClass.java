package com.SwagLab.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;
import com.SwagLab.Utility.PropertiesUtil;

public class BaseClass 
{
	
	public WebDriver driver;
	public P1_Login lp;
	public P2_Inventory ip;
	public PropertiesUtil prop;
	public P3_Cart cp;
	public P4_CheckOut ch;
	public P5_OverView op;
	
		
	
	@BeforeClass
	@Parameters({"bname"})
	public void setUp(String bname)
	{
		prop=new PropertiesUtil("swaglabconfig");
		switch(bname)
		{
		case "chrome":driver=new ChromeDriver();break;
		case "edge":driver=new EdgeDriver();break;
	    case "firefox": driver=new FirefoxDriver();break;
		default: return;
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		lp=new P1_Login(driver);
		ip=new P2_Inventory(driver);
		cp=new P3_Cart(driver);
		ch=new P4_CheckOut(driver);
		op=new P5_OverView(driver);
		
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	public void addWait()
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
