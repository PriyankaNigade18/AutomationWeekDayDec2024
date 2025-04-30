package com.stepdef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartRegisterStep 
{
	public WebDriver driver;
	
	@Given("Open Register application")
	public void open_register_application() {
	   
		driver=new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	}

	@When("user enter all required fields")
	public void user_enter_all_required_fields(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<Map<String,String>> data=table.asMaps();
		driver.findElement(By.id("input-firstname")).sendKeys(data.get(0).get("fname"));
		driver.findElement(By.id("input-lastname")).sendKeys(data.get(0).get("lname"));
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(data.get(0).get("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(data.get(0).get("cpassword"));
		
	}

	@When("User click on yes radio button")
	public void user_click_on_yes_radio_button() {
	   driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
	}

	@When("User check the privacy policy checkbox")
	public void user_check_the_privacy_policy_checkbox() {
	   driver.findElement(By.xpath("//input[@name='agree']")).click();
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
	}

	@Then("User should be able to register successfully")
	public void user_should_be_able_to_register_successfully() {

		String message=driver.findElement(By.xpath("(//h1)[2]")).getText();
		
		Assert.assertTrue(message.contains("Created!"));
		System.out.println("User registration completed!");
	}


}
