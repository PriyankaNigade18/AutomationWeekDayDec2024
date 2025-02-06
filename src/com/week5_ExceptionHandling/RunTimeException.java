package com.week5_ExceptionHandling;

public class RunTimeException 
{
	int id=101;
	
	
	
	public static void main(String args[])
	{
		
		RunTimeException r1=new RunTimeException();
		r1=null;
		try {
		System.out.println(r1.id);//NullPointerException
		}catch(NullPointerException n)
		{
			System.out.println("Please check your object as it is null!");
			System.out.println(n.getMessage());
			n.printStackTrace();
		}
		
		System.out.println("done!");
		System.out.println("**************************************");
		
		String s1="90ABC";
		//string to int
		System.out.println(s1+100);//90100
		try {
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//190
		}catch(NumberFormatException e)
		{
			System.out.println("Please enter valid string with number only");
		}
	
		System.out.println("**************************************");
	
		
		int arr[]= {10,20,30,40};
		System.out.println(arr[3]);//40
		try {
		System.out.println(arr[5]);//ArrayIndexOutOfBoundsException
		}catch(Exception e)
		{
			System.out.println("Please enter valid indexvalue");
		}
		System.out.println("done!");
		
		System.out.println("**************************************");

		
		
		int a=10,b=0;
		System.out.println("Addition is: "+(a+b));
		System.out.println("Subtraction is: "+(a-b));
		try {
		System.out.println("Division is: "+(a/b));//ArithmeticException
		}catch(ArithmeticException t)
		{
			System.out.println("Please enter number other than 0 otherwise you will get : "+t.getMessage());
		}
		System.out.println("Multiplication is: "+(a*b));

		
		
		
		
	}

}
