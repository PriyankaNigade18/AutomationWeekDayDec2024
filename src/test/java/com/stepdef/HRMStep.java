package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.*;

public class HRMStep 
{

	WebDriver driver;
@Given("Open Hrm app")
public void open_hrm_app() {
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("User enter {string} and enter {string}")
public void user_enter_and_enter(String un, String psw) {
    
	driver.findElement(By.name("username")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(psw);
	
}

@When("user click on hrm login button")
public void user_click_on_hrm_login_button() throws InterruptedException {

driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(2000);

}

@Then("only for valid credentials user should be able to login")
public void only_for_valid_credentials_user_should_be_able_to_login() {
	
	Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail!");
	System.out.println("Login successfull!");

}



}
