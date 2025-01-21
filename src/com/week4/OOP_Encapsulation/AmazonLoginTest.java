package com.week4.OOP_Encapsulation;

public class AmazonLoginTest {

	public static void main(String[] args) 
	{

		LoginPage user1=new LoginPage();
		user1.setUsername("Sarang");
		user1.setPassword("test123");
		user1.doLogin(user1.getUsername(),user1.getPassword());
		System.out.println("****************");
		LoginPage user2=new LoginPage();
		user2.setUsername("Smita");
		user2.setPassword("test123");
		user2.doLogin(user2.getUsername(),user2.getPassword());
	}

}
