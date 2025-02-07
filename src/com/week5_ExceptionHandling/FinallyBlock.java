package com.week5_ExceptionHandling;

public class FinallyBlock {

	public static void main(String[] args)
	{
		/*
		 *finally block will help us to write special code
		 *and this block executed with and without exception
		 */

		try {
			System.out.println(9/0);
		}catch(ArithmeticException a) {
			
			System.out.println("Please enter number other than 0");
		}
		finally {
			System.out.println("Test completed!");
		}

	}

}
