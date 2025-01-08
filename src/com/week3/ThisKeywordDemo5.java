package com.week3;



class A
{
	A(ThisKeywordDemo5 t)
	{
		System.out.println("I am A constructor..."+t.amount);
	}
}
public class ThisKeywordDemo5 
{

	//this can be passed as argument in the constructor call.

	int amount=9000;
	public ThisKeywordDemo5()
	{
		System.out.println("Default constructor calling");
		//System.out.println("Amount is: "+amount);
		//this keywrod we are passing as argument to contructor
		A a1=new A(this);
		
	}
	public static void main(String[] args) 
	{
		ThisKeywordDemo5 t1=new ThisKeywordDemo5();
		


	}

}
