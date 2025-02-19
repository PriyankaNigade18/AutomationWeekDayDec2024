package com.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

import org.openqa.selenium.support.locators.RelativeLocator.*;

public class LocatorDemo9_XpathAxies {

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://automationplayground.com/crm/customers.html?email-name=test%40gmail.com&password-name=adasfasd&submit-name=");
		
		//get the ancestor node name for john
		String atag=driver.findElement(By.xpath("//td[text()='John']//ancestor::tbody")).getTagName();
		System.out.println("Ancestor node tagname for john is : "+atag);//tbody
		
		//get the parent node name for John
		String ptag=driver.findElement(By.xpath("//td[text()='John']//parent::tr")).getTagName();
		System.out.println("Parent tag name for John is: "+ptag);//tr
		System.out.println("************************");
		//get the all child elements for row 4
		List<WebElement> list=driver.findElements(By.xpath("//tbody//tr[4]//child::td"));
		System.out.println("Total child under row 4 is: "+list.size());
		for(WebElement i:list)
		{
			System.out.println(i.getText());
		}
		System.out.println("************************");
		//get all td following John
		int fcount=driver.findElements(By.xpath("//td[text()='John']//following::td")).size();
		System.out.println("All following td for john are: "+fcount);//13
		
		System.out.println("************************");

		//get all following siblings for John
		List<WebElement> fsibling=driver.findElements(By.xpath("//td[text()='John']//following-sibling::td"));
		System.out.println("Total Following siblings for John: "+fsibling.size());
		
		for(WebElement i:fsibling)
		{
			System.out.println(i.getText());
		}
		
		System.out.println("************************");
		
		//get the all td tag before john
		int pcount=driver.findElements(By.xpath("//td[text()='John']//preceding::td")).size();
		System.out.println("Total preceding td are: "+pcount);//16
		
		System.out.println("************************");

		//get the all preceding sibling td for John
		
		List<WebElement> pele=driver.findElements(By.xpath("//td[text()='John']//preceding-sibling::td"));
		
		System.out.println("Total preceding sibling td for john: "+pele.size());
		
		for(WebElement i:pele)
		{
			System.out.println(i.getText());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}
	

}
