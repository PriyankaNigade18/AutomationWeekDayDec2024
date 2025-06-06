package com.RestAPITestBDD;

import org.testng.annotations.Test;

import com.PojoClasses.UserPojo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestSerializationdeserialization 
{
	/*
	 * Java object(POJO)----->JSON : Serialization
	 * JSON----->POJO(javaObject)  : De-serialization
	 */
  @Test
  public void testSerialization() throws JsonProcessingException
  {
	  
	  UserPojo u1=new UserPojo();
	  u1.setName("Sarang");
	  u1.setJob("SDET");
	  
	  //POJO---JSON
	  ObjectMapper obj=new ObjectMapper();
	  
	 String json= obj.writerWithDefaultPrettyPrinter().writeValueAsString(u1);
	  
	 System.out.println(json);
	  
	 
	  
  }
  
  
  @Test
  public void testDeserialization() throws JsonMappingException, JsonProcessingException
  {
	  
	  String json="{\n"
	  		+ "  \"name\" : \"Priyanka\",\n"
	  		+ "  \"job\" : \"SDET\"\n"
	  		+ "}";
	  
	  
	  //json--->POJO
	  ObjectMapper obj=new ObjectMapper();
	  UserPojo u1=obj.readValue(json,UserPojo.class);
	  
	  System.out.println(u1.getName());
	  System.out.println(u1.getJob());
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
