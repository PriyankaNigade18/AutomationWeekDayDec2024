package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1_Login 
{
	private WebDriver driver;
	
	//constructor
	public P1_Login(WebDriver driver)//base class driver
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	
	//locator
	@FindBy(id="user-name")
	private WebElement username;
		
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login-button")
	private WebElement loginButton;
	
	
	//action
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public P1_Login setUsername(String un)
	{
		username.sendKeys(un);
		return this;
	}
	
	public P1_Login setPassword(String psw)
	{
		password.sendKeys(psw);
		return this;
	}
	
	public P2_Inventory clickOnLoginButton()
	{
		loginButton.click();
		//after click page navigated to Inventory page
		return new P2_Inventory(driver);
	}
	
	
	public P2_Inventory doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginButton.click();
		return new P2_Inventory(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
