package com.RestAPITestBDD;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.PojoClasses.UserPojo;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
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


public class JSONPayloadWays 
{
  @Test(priority=1)
  public void usingHashMap() 
  {
	  System.out.println("************Payload using HashMap************");
	  //request payload
	  HashMap<String,Object> data=new HashMap<String,Object>();
	  data.put("name","Priyanka");
	  data.put("job","SDET");
	  
	  
	  Response res=given()
			  		.header("x-api-key","reqres-free-v1")
			  		.header("Content-Type","application/json")
			  		.body(data)
	  
			  		.when().post("https://reqres.in/api/users");
	  
	  
	  //validate status code
	  int actcode=res.getStatusCode();	  
	  Assert.assertEquals(actcode,201);
	  System.out.println("Status code matched..."+actcode);
	  
	  //log the body
	  res.then().log().body();
	  
  }
  
  
  @Test(priority=2)
  public void usingPOJO()
  {
	  
	System.out.println("*******Payload using POJO***********");
	
	UserPojo user=new UserPojo();
	user.setName("Priyanka");
	user.setJob("SDET");
	
	
	Response res=given()
						.header("Content-Type","application/json")
							.header("x-api-key","reqres-free-v1")
								.body(user)
								
								.when().post("https://reqres.in/api/users");
	  
	  
	
	//validate status code
	Assert.assertEquals(res.getStatusCode(),201);
	System.out.println("Status code is matched..."+res.getStatusCode());
	  
	
	//log the reponse
	res.then().log().body();
	
	
	
	
	
	  
  }
  
  
  
  @Test(priority=3)
  public void usingJSONObjectClass()
  {
	  System.out.println("************Payload using JSONObject class**********");
	  
	  JSONObject obj=new JSONObject();
	  obj.put("name","Jay");
	  obj.put("job","QA");
	  
	  Response res= given()
			 		.header("Content-Type","application/json")
			 			.header("x-api-key","reqres-free-v1")
			 				.body(obj.toString())
	  
			 					.when().post("https://reqres.in/api/users");
	  
	 
	 //validate status code
		Assert.assertEquals(res.getStatusCode(),201);
		System.out.println("Status code is matched..."+res.getStatusCode());
		  
		
		//log the reponse
		res.then().log().body();
	  
	  
	 
  }
  
  @Test
  public void usingJsonFile() throws FileNotFoundException
  {
	  System.out.println("********Payload using json file************");
	  
	  //file path
	  File f1=new File(System.getProperty("user.dir")+"//Data.json");
	  
	  //read
	  FileReader fr=new FileReader(f1);
	  
	  //json tokener extract character from json file
	  JSONTokener token=new JSONTokener(fr);
	  
	  //jsonobject: will convert token into json object
	  JSONObject obj=new JSONObject(token);
	  
	    
	  Response res= given()
		 		.header("Content-Type","application/json")
		 			.header("x-api-key","reqres-free-v1")
		 				.body(obj.toString())

		 					.when().post("https://reqres.in/api/users");


//validate status code
	Assert.assertEquals(res.getStatusCode(),201);
	System.out.println("Status code is matched..."+res.getStatusCode());
	  
	
	//log the reponse
	res.then().log().body();
  }
  
  
  
  
  
  
  
  
  
  
  
}
