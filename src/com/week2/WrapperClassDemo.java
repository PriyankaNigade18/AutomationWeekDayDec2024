package com.week2;

public class WrapperClassDemo {

	public static void main(String[] args)
	{
		//primitive to Object:Autoboxing
		
		int x=100;//primitive
	
		Integer i1=Integer.valueOf(x);
		
		System.out.println("primitive to Object: "+i1);
	
		
		char c1='A';
		Character ch=Character.valueOf(c1);
		System.out.println("primitive to Object: "+ch);
		
		System.out.println("**************************");
		
		//Object to primitive:Unboxing
		
		Integer a=200;//object
		int y=a.intValue();
		System.out.println("Object to primitive : "+y);
		
		
		
		Long l1=999999L;
		
		long l2=l1.longValue();
		System.out.println("Object to primitive : "+l2);
		
		System.out.println("**********************");
		
		//String to primitive 
		/*
		 * Id data is not parsable you will get exception 
		 * NumberFormatException
		 */
		//String s1="100ABC";
		String s1="100";
		System.out.println(s1+100);//100100
		int num=Integer.parseInt(s1);//NumberFormatException
		System.out.println(num+100);//200
		
		
		String s2="78.66";
		System.out.println(s2+11.11);//78.6611.11
		double d1=Double.parseDouble(s2);
		System.out.println(d1+11.11);//89.77
		
		String s3="R";
	/*
	 * String is collection characters
	 * String is Class in java
	 * charAt(index):char-String
	 */
		
		char c2=s3.charAt(0);
		System.out.println("String to char: "+c2);
		
		//primitive to String(Object)-valueOf()
		
		int b=90;
		System.out.println(b+100);//190
		
		String s=String.valueOf(b);
		System.out.println(s+100);//90100
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		String billmsg="Current purches is with 5000 rupees";
//		String billamount=billmsg.split(" ")[4];
//		int amount=Integer.parseInt(billamount);//5000
//		
//		if(amount==5000)
//		{
//			System.out.println("Test pass: Amount is:  "+amount);
//		}
		
		
		//string to int
		//int amount=5000;
		
		
		
		
		

	}

}
