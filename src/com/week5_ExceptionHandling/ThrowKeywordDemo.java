package com.week5_ExceptionHandling;

public class ThrowKeywordDemo {

	public static void main(String[] args) throws StringIsNullException
	{
/*
 * stack trace....
		String s1="90ABC";
		System.out.println(s1+100);//90100
		int num=Integer.parseInt(s1);
		System.out.println(num+100);//190
		*/
		
		//System.out.println(9/0);
		
		
		String s1=null;
		if(s1==null)
		{
			throw new StringIsNullException("Null String");
		}
		
		
		
		

	}

}
