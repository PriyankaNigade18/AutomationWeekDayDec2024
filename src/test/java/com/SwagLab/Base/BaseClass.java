package com.SwagLab.Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import com.SwagLab.Pages.*;

public class BaseClass 
{
	
	public WebDriver driver;
	public P1_Login lp;
	public P2_Inventory ip;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
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
