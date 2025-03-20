package com.TestNG.PageObjectModelUsingByLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//Encapsulation=private data+public method
public class LoginPage 
{
	private WebDriver driver;
	
	//constructor
	public LoginPage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
	}
	
	
	//locators
	private By usernameTextBox=By.name("username");
	private By passwordTextBox=By.name("password");
	private By loginButton=By.xpath("//button[@type='submit']");
	
	//actions
	public void setUserName(String un)
	{
		driver.findElement(usernameTextBox).sendKeys(un);
	}
	
	public void setPassword(String psw)
	{
		driver.findElement(passwordTextBox).sendKeys(psw);
	}
	
	public void clickOnLoginButton()
	{
	driver.findElement(loginButton).click();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}

}
