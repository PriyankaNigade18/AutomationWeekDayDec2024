package com.SwagLab.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P5_OverView
{

	private WebDriver driver;
	
	public P5_OverView(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='summary_info_label']")
	List<WebElement> lables;
	
	@FindBy(xpath="//div[@class='summary_value_label']")
	List<WebElement> values;
	
	@FindBy(xpath="//div[@class='summary_total_label']")
	WebElement total;
	
	@FindBy(id="finish")
	WebElement finishButton;
	
	@FindBy(tagName="h2")
	WebElement message;
	
	
	public P5_OverView getPayementDetails()
	{
		System.out.println(lables.get(0).getText());
		System.out.println(values.get(0).getText());
		return this;

	}
	
	public P5_OverView getShippingDetails()
	{
		System.out.println(lables.get(1).getText());
		System.out.println(values.get(1).getText());
		return this;
	}
	
	public P5_OverView getTotalPriceDetails()
	{
		System.out.println(lables.get(2).getText());
		System.out.println(total.getText());
		return this;
	}
	
	
//	public P5_OverView getPaymentDetails()
//	{
//		for(WebElement l:lables)
//		{
//			System.out.println(l.getText());
//			for(WebElement v:values)
//			{
//				System.out.println(v.getText());
//			}
//		}
//		
//		System.out.println("Total: "+total.getText());
//		return this;
//		
//	}
	
	
	public String doFinish()
	{
		finishButton.click();
		return message.getText();
		
	}
}
