package com.BasicApiTestNonBDD;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ThirdRequest {
  @Test
  public void testUserListAPI()
  {
	  
	  Response res=RestAssured.given().header("x-api-key","reqres-free-v1").get("https://reqres.in/api/users?page=2");
	  
	  //validation for status code 200
	  int actCode=res.getStatusCode();
	  Assert.assertEquals(actCode,200);
	  System.out.println("Status code mathched!: "+actCode);
	  
	  System.out.println("---------------------------");
	  
	  System.out.println(res.asPrettyString());
	  
	  System.out.println("---------------------------");
	  
	  //validate page value should be 2
	  int pageValue=res.jsonPath().getInt("page");
	  Assert.assertEquals(pageValue,2);
	  System.out.println("Page value is matched!.."+pageValue);
	  
	  //validation for  "total_pages": 2
	  
	  int totalPages=res.jsonPath().getInt("total_pages");
	  Assert.assertEquals(totalPages,2);
	  System.out.println("Total pages matched!..."+totalPages);
	  
	  //validate 4rth position id should be 10--as per index it is 3rd
	  
	  int id=res.jsonPath().getInt("data[3].id");
	  Assert.assertEquals(id,10);
	  System.out.println("Id from 4th position is matched: "+id);
	  
	  
	  //validate "email": "rachel.howell@reqres.in"
	  String email=res.jsonPath().getString("data[5].email");
	  Assert.assertEquals(email,"rachel.howell@reqres.in");
	  System.out.println("Email matched..."+email);
	  
	  
	  //validate list of id
	  List<Integer> allIds=res.jsonPath().getList("data.id");
	  System.out.println("Total id are: "+allIds.size());
	  
	  for(Integer i:allIds)
	  {
		  System.out.println(i);
	  }
	  
	  
	  //validate all emails
	  List<String> allEmails=res.jsonPath().getList("data.email");
	  
	  for(String i:allEmails)
	  {
		  System.out.println(i);
	  }
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
