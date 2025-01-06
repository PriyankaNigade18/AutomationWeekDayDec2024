package com.week3;

public class CompiletimeParameterPassing 
{
	
	
	public void add()//0 parameters
	{
		int a=10,b=20;//local variable
		System.out.println("Addition is: "+(a+b));
	}
	
	public void sub(int a,int b)//2 parameters local variable a=90 b=100
	{
		int c=a-b;
		System.out.println("Subtraction is: "+c);
	}
	
	
	public void mul(int a,int b)//2 parameters  a=10 b=90
	{
		System.out.println("Multiplication is: "+(a*b));
	}
	/*
	 * When we want to return any data/result from the method then we use return keywrod
	 * Rule
	 * =========
	 * 1. we use return keyword and return statement is last statement for method
	 * 2.you need to change return type of method
	 * 3. return keyword return the result to the calling function
	 * 
	 */
	
	//parameter passing with return
	
	public int div(int a,int b)//2 parameters a=90 b=60
	{
		int c=a/b;
		return c;
		
	}
	
	public String info()//0 parameter
	{
		String msg="Hello All!";
		return msg;

	}
	

	public static void main(String[] args)
	{
		//calling methods
		CompiletimeParameterPassing c1=new CompiletimeParameterPassing();
		c1.add();
		/*
		 * When we pass real data(arguments) to the method while 
		 * calling that method is called compile time parameter passing
		 * 
		 * Argument: Passing read data to method
		 * Parameter: passing variables to method which hold some data
		 */
		c1.sub(90,100);
		
		c1.mul(10,90);
		
		int res=c1.div(90,60);
		System.out.println("Division is: "+res);
		
		
		String result=c1.info();
		System.out.println("Info is: "+result);
		
		c1.sub(89,78);
		c1.sub(90,56);
		

	}

}
