package com.SwagLab.Steps;

import org.testng.Assert;

import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Utility.BrowserProvider;
import com.SwagLab.Utility.PropertiesUtil;

import io.cucumber.java.en.*;


public class LoginSteps
{
	PropertiesUtil prop=new PropertiesUtil("Data");
	LoginPage lp=new LoginPage(BrowserProvider.getDriver());
	String actTitle;

	@Given("Open Swaglab application")
	public void open_swaglab_application()
	{
	    //BrowserProvider.getDriver().get("https://www.saucedemo.com/");
		 BrowserProvider.getDriver().get(prop.getData("url"));
	}

	@When("User get the current title")
	public void user_get_the_current_title()
	{
	   actTitle=lp.getAppTitle();
	   System.out.println("Current Application title is: "+actTitle);
	}

	@Then("Title should be match {string}")
	public void title_should_be_match(String expTitle)
	{
	   Assert.assertEquals(actTitle,expTitle,"Application title not matched!");
	   System.out.println("Application title matched!");
	}

	@When("User enter valid username and password")
	public void user_enter_valid_username_and_password()
	{
//		lp.enterUserName("standard_user");
//		lp.enterPassword("secret_sauce");
		
		lp.enterUserName(prop.getData("un"));
		lp.enterPassword(prop.getData("psw"));

	  
	}

	@When("user click on login button")
	public void user_click_on_login_button()
	{
	    lp.clickOnLoginButton();
	}

	@Then("User should be login and  navigated to Inventory page")
	public void user_should_be_login_and_navigated_to_inventory_page() {
	   
		String exp="inventory";
		Assert.assertTrue(lp.getAppUrl().contains(exp),"Login Fail!");
		System.out.println("login completed...user nvigated to inventory page");
	}

}
