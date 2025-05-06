package com.SwagLab.Steps;

import java.util.List;

import org.testng.Assert;

import com.SwagLab.Pages.InventoryPage;
import com.SwagLab.Pages.LoginPage;
import com.SwagLab.Utility.BrowserProvider;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;

public class InventorySteps 
{
	LoginPage lp=new LoginPage(BrowserProvider.getDriver());
	InventoryPage ip;
	int count;
	String productName;

@Given("User must be login with valid credentials")
public void user_must_be_login_with_valid_credentials(DataTable table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	
	
	BrowserProvider.getDriver().get("https://www.saucedemo.com/");
	//read data from table
	
	List<List<String>> data=table.cells();
	String un=data.get(0).get(0);
	String psw=data.get(0).get(1);
	//Intialized inventory page object
	ip=lp.doLogin(un,psw);
	
    
}

@Given("User is on Inventory page")
public void user_is_on_inventory_page() {
    
	Assert.assertTrue(lp.getAppUrl().contains("inventory"));
	System.out.println("User is on Inventory page");
}

@When("user get the current count of product")
public void user_get_the_current_count_of_product() {
    	
	count=ip.getProductCount();
    	
}

@Then("Total product should match to {int}")
public void total_product_should_match_to(Integer expCount) {
    
	Assert.assertEquals(count,expCount);
	System.out.println("Product count is matched...Total products are: "+count);
}

@When("User get the product details")
public void user_get_the_product_details()
{
	ip.getProductDetails();
    
}

@Then("All product should be display")
public void all_product_should_be_display() 
{
    System.out.println("Product details get displyed!");
}

@When("User add the product to cart {string}")
public void user_add_the_product_to_cart(String pname) {
   
	productName=ip.addProductToCart(pname);
}

@Then("Product should be added to the cart and open cart page")
public void product_should_be_added_to_the_cart_and_open_cart_page() {

System.out.println("Product added to cart: "+productName);
ip.launchCartPage();
}

}
