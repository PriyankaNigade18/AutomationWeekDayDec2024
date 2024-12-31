package com.week2;

public class TypeCasting {

	public static void main(String[] args)
	{
		// primitive to primitive
		
		//implicit
		char c1='A';//2byte
		int i=c1;//store ascii
		System.out.println("char to int conversion: "+i);//65
		
		int x=9999;
		float f1=x;
		System.out.println("int to float conversion: "+f1);//9999.0
		
		double d1=f1;
		System.out.println("float to double conversion: "+d1);
		
		System.out.println("********************************************");
		//Explicit manual conversion-->casting operator
		
		long l1=999999999999L;//8byte
		int i1=(int)l1;//Type mismatch: cannot convert from long to int
		System.out.println("long to int conversion: "+i1);
		
		int c=122;
		char c2=(char) c;
		System.out.println("int to char conversion: "+c2);
		
		double d2=98.677554;
		float f2=(float) d2;
		System.out.println("double to float: "+f2);
		
		
		
		
		

		
		
		

	}

}
