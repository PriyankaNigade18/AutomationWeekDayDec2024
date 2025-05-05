package com.AppHooks;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks 
{
	public WebDriver driver;
	
	@Before
	public void setUp()
	{
		//driver=new ChromeDriver();
		driver=BrowserProvider.setDriver("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
