package com.SwagLab.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P4_CheckOut
{
	private WebDriver driver;

	public P4_CheckOut(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	@FindBy(id="first-name")
	WebElement fname;
	
	@FindBy(id="last-name")
	WebElement lname;
	
	@FindBy(id="postal-code")
	WebElement pcode;
	
	@FindBy(id="continue")
	WebElement continueButton;
	
	
	
	public P5_OverView doCheckout(String fn,String ln,String pc)
	{
		fname.sendKeys(fn);
		lname.sendKeys(ln);
		pcode.sendKeys(pc);
		System.out.println("First name is: "+fn+" : "+"last name is: "+ln);
		continueButton.click();
		return new P5_OverView(driver);
		
	}
}
