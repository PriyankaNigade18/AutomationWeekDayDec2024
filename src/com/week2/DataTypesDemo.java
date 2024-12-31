package com.week2;

public class DataTypesDemo {

	public static void main(String[] args) 
	{
		//Primitive
		// boolean 1bit true/false
		boolean status=true;
		System.out.println("Boolean data is: "+status);
		
		status=false;
		System.out.println("Updated status is: "+status);
		boolean newstatus=false;
		System.out.println("Boolean new status is: "+newstatus);
		
		System.out.println("**********************************");
		
		//primitive-->numeric--->char 
		/*
		 * char data type size 2byte
		 * char can store single character A-z
		 * store special characters
		 * store ASCII values for character
		 * A-Z= 65 to 90
		 * a-z= 97 to 122
		 * 0-9= 48 to 57
		 * 
		 */
		
		char c1='A';
		char c2='$';
		char c3=90;//it store 90 as ascii for character Z
		System.out.println("Character data is: "+c1);//A
		System.out.println("Character data is: "+c2);//$
		System.out.println("Character data is: "+c3);//Z

		char c4=55;
		System.out.println("Character value for ascii 55 is: "+c4);
		
		System.out.println("*************************");
		//primitive--->Integral--->Numeric--->Integer
		
		//byte-->short--->int(default)---->long
		//byte 1byte -128 to 127
		
		byte b1=120;
		byte b2=-126;
		byte b3=127;
		byte b4=-128;
		//byte b5=130;//Type mismatch: cannot convert from int to byte
		System.out.println("byte data is: "+b1);
		System.out.println("byte data is: "+b2);
		System.out.println("byte data is: "+b3);
		System.out.println("byte data is: "+b4);
		
		
		
		//short 2byte -32768 to 32767
		
		short s1=32767;
		short s2=-32768;
		//short s3=50000;//Type mismatch: cannot convert from int to short
		System.out.println("Short data is: "+s1);
		System.out.println("Short data is: "+s2);

		//int 4byte 
		
		int i1=50000;
		
		//int i2=9999999999;//The literal 9999999999 of type int is out of range 
		
		int i2=999999999;
		System.out.println("integer data is: "+i1);
		System.out.println("integer data is: "+i2);
		
		//long 8byte 
		long l1=9999999999L;
		long l2=190L;
		
		System.out.println("Long data is: "+l1);
		System.out.println("Long data is: "+l2);
		
		//primitive --->Integral--->Numeric--->floating point
		//float 4byte   double  8yte (default)
		
		double d1=90.6754433;
		System.out.println("Double data is: "+d1);
		
		float f1=56.5678F;
		System.out.println("Float data is: "+f1);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
