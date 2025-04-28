package com.stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps 
{
	public WebDriver driver;
	String actTitle;

@Given("launch Google application")
public void launch_google_application()
{
	//create a driver session
    driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.google.com");
}

@When("I get the current title of the page")
public void i_get_the_current_title_of_the_page() 
{
    actTitle=driver.getTitle();
    System.out.println("Current title of the page: "+actTitle);
}

@Then("title should match with expected home page title")//Google
public void title_should_match_with_expected_home_page_title()
{
	
	//validate title -Assertion
	Assert.assertEquals(actTitle,"Google","Title not matched....Test Fail");
	System.out.println("Title matched...Test Pass: "+actTitle);
    
}

@When("I enter valid keyword into search box")
public void i_enter_valid_keyword_into_search_box() {
    driver.findElement(By.id("APjFqb")).sendKeys("Java");
    
}

@Then("I shuld get valid google search result")
public void i_shuld_get_valid_google_search_result()
{
	List<WebElement> options=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
	
	for(WebElement i:options)
	{
		System.out.println(i.getText());
	}
	
	
	
   
}


}
