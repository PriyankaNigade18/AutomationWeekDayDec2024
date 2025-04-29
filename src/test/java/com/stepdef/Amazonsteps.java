package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class Amazonsteps 
{
	public WebDriver driver;

	String actTitle;
	
@Given("Open Amazon application")
public void open_amazon_application()
{
	driver=new EdgeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
}

@When("I get the current title of amazon home page")
public void i_get_the_current_title_of_amazon_home_page() {
    actTitle=driver.getTitle();
}

@Then("title should match with home page")
public void title_should_match_with_home_page() {
    String expTitle="India";
    Assert.assertTrue(actTitle.contains(expTitle));
    System.out.println("Home page title matched!");
}

@When("I open Sell page")
public void i_open_sell_page()
{
    driver.findElement(By.linkText("Sell")).click();
}

@When("I get the current title of Sell page")
public void i_get_the_current_title_of_sell_page() {
actTitle=driver.getTitle();
}

@Then("title should match with Sell page")
public void title_should_match_with_sell_page() {

	 Assert.assertTrue(actTitle.contains("All"));
	  System.out.println(" Sell page title matched!");
}

@When("I open Mobile page")
public void i_open_mobile_page() {
    driver.findElement(By.linkText("Mobiles")).click();
}

@When("I get the current title of Mobile page")
public void i_get_the_current_title_of_mobile_page() {
	actTitle=driver.getTitle();
}

@Then("title should match with Mobile page")
public void title_should_match_with_mobile_page() {
	 Assert.assertTrue(actTitle.contains("Phones"));
	  System.out.println(" Mobile page title matched!");
}

@When("I open Fashion page")
public void i_open_fashion_page() {
   driver.findElement(By.linkText("Fashion")).click();
   
}

@When("I get the current title of Fashion page")
public void i_get_the_current_title_of_fashion_page() {
   actTitle=driver.getTitle();
}

@Then("title should match with Fashion page")
public void title_should_match_with_fashion_page() {

	 Assert.assertTrue(actTitle.contains("Store"));
	  System.out.println(" Fashion page title matched!");
}




}
