package com.Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo7_XpathOperatorandIndexing {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");

		
		//first name
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Smita");
		
		//last name-Or operator
		driver.findElement(By.xpath("//input[@name='lastname' or @class='form-contro']")).sendKeys("shinde");
		
		//email and Operator
		driver.findElement(By.xpath("//input[@placeholder='E-Mail' and @class='form-control']")).sendKeys("smitatest1234@gmail.com");
		
		//telephone- indexing
		driver.findElement(By.xpath("(//input[@class='form-control'])[4]")).sendKeys("88777655555");
		
		//password- position()
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=5]")).sendKeys("test123");
		
		//confirm password
		driver.findElement(By.xpath("(//input[@class='form-control'])[position()=6]")).sendKeys("test123");
		
		
		//radio button-yes
		driver.findElement(By.xpath("(//input[@name='newsletter'])[1]")).click();
		
		
		//checkbox
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		
		//continue button
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		
		//get the final message
		String text=driver.findElement(By.xpath("(//h1)[2]")).getText();
		System.out.println("For successfull message: "+text);
		
		
		
		
		
		
		
		
		
	}
	
	

}
