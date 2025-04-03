package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

public class T4_CheckOutPageTest extends BaseClass
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
		ch=cp.openCheckoutPage();
	}
	
	
  @Test(priority=1)
  public void validateCheckOut() 
  {
	  ch.doCheckout(prop.getData("fn"),prop.getData("ln"),prop.getData("pc"));
	  
  }
}
