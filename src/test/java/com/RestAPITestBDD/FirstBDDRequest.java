package com.RestAPITestBDD;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

/*
 * given(): pre-requisite
 * ----------------------------------------
 * endpoint,request payload, path and query parameters, headers, Authentication
 * 
 * when(): Request
 * -------------------------------------------
 * GET,POST,PUT,PATCH,DELETE
 * 
 * then():validate Response
 * -----------------------------------------
 * status code,status message,response payload,header,cookies
 * 
 */
public class FirstBDDRequest {
  @Test
  public void testSingleUser()
  {
	  
		given()
		.header("x-api-key","reqres-free-v1")
		
		.when().get("https://reqres.in/api/users/2")
		
		.then()
			.statusCode(200)
			.body("data.id",equalTo(2))
			//log all response form server
			//.log().all();
			
			//log only headers
			//.log().headers();
			
			//log only body
			.log().body();
		
	  
	  
  }
  
  @Test
  public void getRequest()
  {
	  Response res=given()
			  		.header("x-api-key","reqres-free-v1")
	  
			  			.when().get("https://reqres.in/api/users/2");
	  
	  //validate status code
	  int statusCode=res.getStatusCode();
	  Assert.assertEquals(statusCode,200);
	  System.out.println("Status code matched!: "+statusCode);
	  
	  //validate json body "first_name": "Janet"
	  
	  String fname=res.jsonPath().getString("data.first_name");
	  Assert.assertEquals(fname,"Janet");
	  System.out.println("First name matched!.."+fname);
	  
	  //log the body in console
	  res.then().log().body();
	  
	  
  }
  
  @Test
  public void listOfUsers()
  {
	  
	  Response res=given()
			  			.header("x-api-key","reqres-free-v1")
	  
			  				.when().get("https://reqres.in/api/users?page=2");
	  
	  //validate status code 200
	  Assert.assertEquals(res.getStatusCode(),200);
	  System.out.println("Status code matched to 200!");
	  
	  //validate list of id
	  List<Integer> allIds=res.jsonPath().getList("data.id");
	  
	  for(Integer i:allIds)
	  {
		  System.out.println(i);
	  }
	  
	  //log the body
	  res.then().log().body();
	  
	  
	  
	  
	  
	  
  }
  
}
