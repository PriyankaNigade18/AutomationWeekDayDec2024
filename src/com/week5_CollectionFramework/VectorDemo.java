package com.week5_CollectionFramework;

import java.util.Vector;

public class VectorDemo {
	/*
	 * Vector is class implement List interface
	 * Underline data structure is Dynamic array
	 * Vector is synchronize,performance is slow
	 * 
	 */
	public static void main(String[] args)
	{

		Vector<Integer>  v1=new Vector<Integer>();
		System.out.println("Is list is empty?: "+v1.isEmpty());
		if(v1.isEmpty())
		{
			v1.add(10);
			v1.add(20);
			v1.add(20);
			v1.add(90);
			v1.add(100);
			
		}
		System.out.println(v1);
		System.out.println("After adding elements is vector empty?: "+v1.isEmpty());
		System.out.println("Total elements: "+v1.size());
		System.out.println("Search for 50?: "+v1.contains(50));
		v1.add(0,88);
		System.out.println(v1);

	}

}
