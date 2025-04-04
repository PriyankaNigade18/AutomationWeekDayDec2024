package com.SwagLab.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.Base.BaseClass;

public class T5_OverviewPageTest extends BaseClass
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
		addWait();
		op=ch.doCheckout(prop.getData("fn"),prop.getData("ln"),prop.getData("pc"));
		addWait();
	}
	
  @Test(priority=1)
  public void verifyPayementDeatails()
  {
	  op.getPayementDetails();
  }
  
  @Test(priority=2)
  public void verifyshippingDetails()
  {
	  op.getShippingDetails();
  }
  @Test(priority=3)
  public void verifyPriceDetails()
  {
	  op.getTotalPriceDetails();
  }
  
  @Test(priority=4)
  public void validateCheckoutProcess()
  {
	 String message=op.doFinish();
	 System.out.println(message);
  }
}
