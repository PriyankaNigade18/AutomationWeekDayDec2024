package com.week4.OOP_Polymorphism;

public class AmazonSearch
{
	
	
	public void search(String pname)
	{
	System.out.println("Search by product name: "+pname);	
	}
	
	public void search(int price)
	{
	System.out.println("Search by product price: "+price);	
	}
	
	public void search(String pname,String bname)
	{
	System.out.println("Search by product name: "+pname+" search by brand name: "+bname);	
	}

	
	public void search(String pname,int price)
	{
	System.out.println("Search by product name: "+pname+" search by product price: "+price);	
	}
	
	public void search(int price,String bname)
	{
	System.out.println("Search by product price: "+price+" search by brand name: "+bname);	
	}
}

