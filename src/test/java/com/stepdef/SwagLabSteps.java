package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SwagLabSteps 
{
	public WebDriver  driver;
	
	
	@Given("Open Swaglab application with url {string}")
	public void open_swaglab_application_with_url(String url)
	{
		driver=new ChromeDriver();
		driver.get(url);
	   
	}

	@When("I enter valid {string} and  valid {string}")
	public void i_enter_valid_and_valid(String un, String psw)
	{
		driver.findElement(By.id("user-name")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(psw);
		
	    
	}

	@When("I click on SwagLab login button")
	public void i_click_on_swag_lab_login_button()
	{
	    driver.findElement(By.id("login-button")).click();
	}

	@Then("I should navigate to Inventory page")
	public void i_should_navigate_to_inventory_page() 
	{
		String expUrl="inventory";
		
		Assert.assertTrue(driver.getCurrentUrl().contains(expUrl),"Login fail......");
		System.out.println("Login Completed....");
	    
	}




}
