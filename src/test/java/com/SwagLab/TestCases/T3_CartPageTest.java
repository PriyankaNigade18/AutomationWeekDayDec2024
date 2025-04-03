package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

public class T3_CartPageTest extends BaseClass 
{
	@BeforeClass
	public void pageSetUp()
	{
		ip=lp.doLogin(prop.getData("un"),prop.getData("psw"));
		addWait();
		ip.addProductToCart(prop.getData("pname"));
		addWait();
		cp=ip.openCartPage();
		addWait();
	}
	
	
	
  @Test(priority=1)
  public void verifyProductAddedToCart()
  {
	  String detail=cp.getCartProductDetails();
	  System.out.println("Product added to cart: "+detail);
  }
  
  @Test(priority=2)
  public void validateProductRemove()
  {
	  cp.removeProduct();
	  addWait();
  }
  
  @Test(priority=3)
  public void validateContinueShopping()
  {
	  ip=cp.doContinueShopping();
	  addWait();
	  ip.addProductToCart(prop.getData("pname2"));
	  addWait();
	  ip.openCartPage();
	  addWait();
  }
  
  @Test(priority=4)
  public void verifyCheckOutPageLaunch()
  {
	  cp.openCheckoutPage();
	  addWait();
  }
}
