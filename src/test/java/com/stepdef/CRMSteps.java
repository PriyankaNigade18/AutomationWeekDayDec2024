package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.AppHooks.AppHooks;
import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMSteps // extends AppHooks not allowed in cucumber
{

	//current driver is null
	WebDriver driver=BrowserProvider.getDriver();
	WebElement link;
	
	/*@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
		
	}
	*/
	@Given("Open CRM homepage")
	public void open_crm_homepage()
	{
	    driver.get("https://automationplayground.com/crm/");
	}

	@When("link is displayed")
	public void link_is_displayed() {
	  link=driver.findElement(By.linkText("Sign In"));
	 
	    if(link.isDisplayed())
	    {
	    	System.out.println("Link is displayed on the page!");
	    }
	}

	@Then("click on Link")
	public void click_on_link() 
	{
	    link.click();
	}

	@When("User click on signin link")
	public void user_click_on_signin_link()
	{
		link=driver.findElement(By.linkText("Sign In"));
	   link.click();
	}

	@When("user enter valid creadentials {string} and {string}")
	public void user_enter_valid_creadentials_and(String email, String psw) {
	    driver.findElement(By.id("email-id")).sendKeys(email);
	    driver.findElement(By.id("password")).sendKeys(psw);
	}

	@When("user click on crm Submit button")
	public void user_click_on_crm_submit_button() throws InterruptedException {
	   driver.findElement(By.id("submit-id")).click();
	   Thread.sleep(3000);
	}

	@Then("User should be navigated to customer page")
	public void user_should_be_navigated_to_customer_page() {
	    
		Assert.assertTrue(driver.getCurrentUrl().contains("customers"),"Login Fail!");
		System.out.println("Login Completed!");
	}

}
