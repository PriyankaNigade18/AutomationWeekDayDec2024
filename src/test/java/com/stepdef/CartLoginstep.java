package com.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class CartLoginstep {

	WebDriver driver;
	
	@Given("Open Login page")
	public void open_login_page() {
	    driver=new ChromeDriver();
	    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
	}

	@When("User enter required login fields")
	public void user_enter_required_login_fields(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<List<String>> data=table.cells();
		
		driver.findElement(By.id("input-email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.id("input-password")).sendKeys(data.get(0).get(1));

	}

	@When("User click on cart login button")
	public void user_click_on_cart_login_button() {

		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Then("User should navigate account page")
	public void user_should_navigate_account_page() {
	    
		Assert.assertTrue(driver.getCurrentUrl().contains("account"));
		System.out.println("Login Completed!");
	}
}
