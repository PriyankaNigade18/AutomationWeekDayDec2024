package com.week3.Array_String;

public class AdditionArrayTask {

	public static void main(String[] args)
	{
		//array1
		int ar1[]=new int[4];
		ar1[0]=10;
		ar1[1]=20;
		ar1[2]=30;
		ar1[3]=40;
		
		System.out.println("Array1 length is: "+ar1.length);
		System.out.println("Array1 elements: ");
		for(int i=0;i<ar1.length;i++)
		{
			System.out.println(ar1[i]);
		}
		
		//array2
		int ar2[]=new int[4];
		ar2[0]=1;
		ar2[1]=2;
		ar2[2]=3;
		ar2[3]=4;
		
		System.out.println("Array2 length is: "+ar2.length);
		System.out.println("Array2 elements: ");
		for(int i=0;i<ar2.length;i++)
		{
			System.out.println(ar2[i]);
		}
		
		System.out.println("Addition of both the array: ");
		//sum array
		int sum[]=new int[4];
		
		for(int i=0;i<ar1.length;i++)
		{
			sum[i]=ar1[i]+ar2[i];
			System.out.println(sum[i]);
		}
		
		//System.out.println("Addition of both the array: ");
		//print result
//		for(int j=0;j<sum.length;j++)
//		{
//			System.out.println(sum[j]);
//		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
