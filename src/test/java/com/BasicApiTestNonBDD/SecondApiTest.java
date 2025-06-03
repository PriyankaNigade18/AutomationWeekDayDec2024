package com.BasicApiTestNonBDD;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SecondApiTest {
  @Test
  public void validateGetRequest() 
  {
	  
	   
	  Response res=RestAssured.get("https://reqres.in/api/users/2");
	  
	  int actcode=res.getStatusCode();
	  Assert.assertEquals(actcode,200,("Status code not matched..."+actcode));
	  System.out.println("Status code matched..."+actcode);
	  
	  String actmessage=res.getStatusLine();
	  Assert.assertTrue(actmessage.contains("OK"));
	  System.out.println("Status messaged matched..."+actmessage);
	  
	  
	  //header validation
	  String actContenttype=res.getHeader("Content-Type");
	  Assert.assertTrue(actContenttype.contains("application/json"));
	  System.out.println("Header matched!...."+actContenttype);
	  
	  
	  //response time should be less that 1000ms
	  long restime=res.getTime();
	  Assert.assertTrue(restime<1000);
	  System.out.println("Total response time in milli seconds: "+restime);
	  
	  //json body validation: jsonPath()
	  
	  //print in the console
	  System.out.println(res.asPrettyString());
	  
	  
	  //test for id=2
	  
	  int id=res.jsonPath().getInt("data.id");
	  Assert.assertEquals(id,2);
	  System.out.println("Json id matched: "+id);
	  
	  
	  //first_name=Janet
	   String fname=res.jsonPath().getString("data.first_name");	  
	  
	  Assert.assertEquals(fname,"Janet");
	  System.out.println("First name is matched...."+fname);
	  
	  	  
	  
  }
}
