package com.week4.OOP_Polymorphism;

public class AmazonSearchTest 
{

	public static void main(String[] args) 
	{

		AmazonSearch obj=new AmazonSearch();
		obj.search("iphnoe");
		obj.search(90000);
		obj.search("watch", 50000);
		obj.search("bag","zara");
		obj.search(70000,"Hp");

	}

}
