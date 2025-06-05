package com.RestAPITestBDD;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.PojoClasses.Authenticate;
import com.PojoClasses.Booking;
import com.PojoClasses.BookingDates;

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
public class HotelBookingAPIChaining
{
	 int bookingid;
	 String tokenValue;
	 
  @Test(priority=1)
  public void createBooking()
  {
	  System.out.println("******Create booking with POST call*****");
	  //payload
	  BookingDates dates=new BookingDates();
	  dates.setCheckin("2025-06-05");
	  dates.setCheckout("2025-06-06");
	  
	  Booking booking=new Booking();
	  booking.setFirstname("Priyanka");
	  booking.setLastname("Nigade");
	  booking.setTotalprice(99999);
	  booking.setDepositpaid(true);
	  booking.setBookingdates(dates);
	  booking.setAdditionalneeds("dinner");
	  
	  
 Response res=given()
		 .header("Content-Type","application/json")
		 .body(booking)
	  
		 .when().post("https://restful-booker.herokuapp.com/booking");
 
 
 //validate status code should be 200
 
 Assert.assertEquals(res.getStatusCode(),200);
 System.out.println("Status code matched..."+res.getStatusCode());
 
 //log the result
 res.then().log().body();
 
 //get the json booking id
 bookingid=res.jsonPath().getInt("bookingid");
 
System.out.println("Generated booking id is: "+bookingid);
 
  }
  
  
  @Test(priority=2,dependsOnMethods = "createBooking")
  public void getBookingdetails()
  {
	  System.out.println("******Get booking details with GET call*****");
	  Response res=given()
			  		.header("Content-type","application/json")
			  		
			  			.when().get("https://restful-booker.herokuapp.com/booking/"+bookingid);
	  
	  //validate response status code
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,200);
	  System.out.println("Status code matched..."+code);
	  
	  //log the result
	  res.then().log().body();
	  System.out.println("Details with same booking id: "+bookingid);
  }
  
  
  @Test(priority=3)
  public void createToken()
  {
	  System.out.println("******Generate Token with POST call*****");

	  //payload
	  Authenticate auth=new Authenticate();
	  auth.setUsername("admin");
	  auth.setPassword("password123");
	  
	  Response res=given()
			  .header("Content-type","application/json")
			  .body(auth)
	  	  
			  .when().post("https://restful-booker.herokuapp.com/auth");
	  
	  //validate code
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,200);
	  System.out.println("Status code matched..."+code);
	  
	  //log the response
	  res.then().log().body();
	  
	  //get the token
	  tokenValue=res.jsonPath().getString("token");
	  System.out.println("Token generated is: "+tokenValue);
	  
  }
  
  @Test(priority=4)
  public void fullBookingUpdate()
  {
	  System.out.println("******Update booking with PUT call*****");
	  
	//payload
	  BookingDates dates=new BookingDates();
	  dates.setCheckin("2025-06-08");
	  dates.setCheckout("2025-06-10");
	  
	  Booking booking=new Booking();
	  booking.setFirstname("Jay");
	  booking.setLastname("Nigade");
	  booking.setTotalprice(8877);
	  booking.setDepositpaid(false);
	  booking.setBookingdates(dates);
	  booking.setAdditionalneeds("lunch");
	  
	  Response res=given()
			  .header("Content-Type","application/json")
			  	.header("Accept","application/json")
			  	.header("Cookie", "token="+tokenValue)
			  	.body(booking)

			  	.when().put("https://restful-booker.herokuapp.com/booking/"+bookingid);
	  
	//validate code
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,200);
	  System.out.println("Status code matched..."+code);
	  
	  //log the response
	  res.then().log().body();
	  
	  System.out.println("Booking updated for id: "+bookingid);
	  
	  
	  
	  	  
  }
  
  @Test (priority=5)
  public void partialUpdate()
  {
	  System.out.println("******Partail Update booking with PATCH call*****");
	  
		//payload
		  BookingDates dates=new BookingDates();
		  dates.setCheckin("2025-06-08");
		  dates.setCheckout("2025-06-10");
		  
		  Booking booking=new Booking();
		  booking.setFirstname("Jayesh");
		  booking.setLastname("Sharma");
		  booking.setTotalprice(8877);
		  booking.setDepositpaid(false);
		  booking.setBookingdates(dates);
		  booking.setAdditionalneeds("lunch");
		 
		  
		  Response res=given()
				  .header("Content-Type","application/json")
				  	.header("Accept","application/json")
				  	.header("Cookie", "token="+tokenValue)
				  	.body(booking)

				  	.when().patch("https://restful-booker.herokuapp.com/booking/"+bookingid);
		  
		//validate code
		  int code=res.getStatusCode();
		  Assert.assertEquals(code,200);
		  System.out.println("Status code matched..."+code);
		  
		  //log the response
		  res.then().log().body();
		  
		  System.out.println("Booking partial updated for id: "+bookingid);
		  
		  
		  
		  
  }
  
  
  @Test(priority=6)
  public void getUpdatedBookingdetails()
  {
	  System.out.println("******Get Updated booking details with GET call*****");
	  Response res=given()
			  		.header("Content-type","application/json")
			  		
			  			.when().get("https://restful-booker.herokuapp.com/booking/"+bookingid);
	  
	  //validate response status code
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,200);
	  System.out.println("Status code matched..."+code);
	  
	  //log the result
	  res.then().log().body();
	  System.out.println("Details with same booking id: "+bookingid);
  }
  
  @Test(priority=7)
  public void deleteBooking()
  {
	  System.out.println("******Delete created booking with DELETE call*****");

	  Response res=given()
	  .header("Content-Type","application/json")
	  .header("Cookie","token="+tokenValue)
	  
	  .when().delete("https://restful-booker.herokuapp.com/booking/"+bookingid);
	  
	  //validate response status code
	  int code=res.getStatusCode();
	  Assert.assertEquals(code,201);
	  System.out.println("Status code matched..."+code);
	  
	  System.out.println("Booking deleted for id: "+bookingid);
  }
  
  
  
  
  
  
  
  
  
}
