package com.SwagLab.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Locators
	private By username=By.id("user-name");
	private By password=By.id("password");
	private By loginBtn=By.id("login-button");
	
	//method
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle() 
	{
		return driver.getTitle();
	}
	
	public void enterUserName(String un)
	{
		driver.findElement(username).sendKeys(un);
	}

	public void enterPassword(String psw)
	{
		driver.findElement(password).sendKeys(psw);
	}
	
	public void clickOnLoginButton()
	{
		driver.findElement(loginBtn).click();
	}
	
	//navigated next page
	public InventoryPage doLogin(String un,String psw)
	{
		driver.findElement(username).sendKeys(un);
		driver.findElement(password).sendKeys(psw);
		driver.findElement(loginBtn).click();
		return new InventoryPage(driver);
	}
	
	
	
	
	
}
