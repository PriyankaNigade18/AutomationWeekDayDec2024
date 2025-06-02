package com.BasicApiTestNonBDD;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstRequest {
  @Test
  public void testGetRequest()
  {
	  /*
	   * RestAssured is class and Response is interface in this framework
	   */
	  
	 Response res=RestAssured.get("https://reqres.in/api/users/2");
	 System.out.println("Status code is: "+res.getStatusCode());
	 System.out.println("Status line is: "+res.getStatusLine());
	 System.out.println("Respons time in mls: "+res.getTime());//562
	 System.out.println("Response in sec: "+res.getTimeIn(TimeUnit.SECONDS));//1sec=1000ms==>0sec
	 
	 System.out.println("**********Raw type response payload************");
	 
	 System.out.println(res.asString());
	 
	 System.out.println("**********JSON type response payload************");
	 
	 System.out.println(res.asPrettyString());

	 
	 
	 
	 
	 
	 
	 
	 
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
