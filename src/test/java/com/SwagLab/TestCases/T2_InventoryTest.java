package com.SwagLab.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

public class T2_InventoryTest extends BaseClass
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin("standard_user","secret_sauce");
	}
	
	
	
  @Test(priority=1)
  public void verifyProductCount()
  {
	  int count=ip.getProductCount();
	  Assert.assertEquals(count,6);
	  System.out.println("Product count matched...Total products are: "+count);
  }
  
  @Test(priority=2)
  public void verifyProductDetails()
  {
	ip.getProductDetails();  
	  
  }
  
  
  @Test(priority=3)
  public void validateAddToCartFeature() 
  {
	  ip.addProductToCart("Sauce Labs Bike Light");
  }
}
