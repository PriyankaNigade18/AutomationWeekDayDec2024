package com.week4.OOP_DataAbstraction;

public class TestBAnk {

	public static void main(String[] args) 
	{
		// child class ref and child class object
		HDFC h1=new HDFC();
		h1.custDetails();//individual
		h1.deposite();//inherited abstract 
		h1.withdraw();//inherited abstract 
		h1.rateOfInterest();//inherited abstract 

		System.out.println("******************************");
		
		//parent ref and child class object
		RBI r1=new HDFC();
		r1.deposite();
		r1.withdraw();
		r1.rateOfInterest();
		
	}

}
