package com.RestAPITestBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
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
public class QueryPathParameterTest {
  @Test
  public void requestUsingQueryPath()
  {
	  //https://api.restful-api.dev/objects?id=3&id=5&id=10
	  
	  RestAssured.baseURI="https://api.restful-api.dev";
	  
	 Response res= given()
	  .header("Content-Type","application/json")
	  .pathParam("path","/objects")
	  .queryParam("id",3)
	  .queryParam("id",5)
	  .queryParam("id",10)
	  
	  
	 // .when().get("https://api.restful-api.dev/{path}");
	  
	  .when().get("{path}");
	 
	 //validate status code
	 int code=res.getStatusCode();
	 Assert.assertEquals(code,200);
	 System.out.println("Status code matched!...");
	  
	 
	 //get the response
	 res.then().log().body();
	 
	 
	  
	  
	  
	  
  }
}
