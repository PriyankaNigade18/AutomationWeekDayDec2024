package com.TestNG.PageObjectModelUsingPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//Encapsulation=private data + public method
public class HrmLoginPage
{
	private WebDriver driver;
	//constructor
	public HrmLoginPage(WebDriver driver)//driver from BaseClass
	{
		this.driver=driver;
		//Element initialization
		PageFactory.initElements(driver,this);
	}
	
	//locator
	
	@FindBy(name="username") 
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginButton;
	
	//actions
	
	public void setUserName(String un)
	{
		username.sendKeys(un);
	}
	
	public void setPassword(String psw)
	{
		password.sendKeys(psw);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public void doLogin(String un,String psw)
	{
		username.sendKeys(un);
		password.sendKeys(psw);
		loginButton.click();
		
	}
	
	
	
	
	
	
	

}
