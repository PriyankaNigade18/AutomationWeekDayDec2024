package com.week4.OOP_DataAbstraction;

public class HDFC implements RBI
{
	
	public void custDetails()
	
	{
		System.out.println("HDFC.....CustomerDetails()");
	}

	@Override
	public void deposite() {
		System.out.println("HDFC......deposite()");
		
	}

	@Override
	public void withdraw() {
		System.out.println("HDFC.....Withdraw()");
		
	}

	@Override
	public void rateOfInterest()
	{	//x=300;
		System.out.println(x);
		System.out.println("HDFC.....rateOfInterestis 8%");

		
	}

}
