package com.week5_CollectionFramework;

import java.util.ArrayList;

public class ArrayListDemo2_Methods {
	/*
	 * ArrayList is class implements List interface
	 * ArrayList underline data structure is Dynamic array
	 * ArrayList is order collection,is based on indexing
	 * Duplication allowed
	 * It is non synchronize
	 * Default capacity for ArrayList is 10
	 * Frequent operation is data retrieval
	 */
	public static void main(String[] args) 
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		System.out.println("Is this list empty?: "+al.isEmpty());//true
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(null);
		al.add(20);
		System.out.println(al);
		System.out.println("Is this list empty?: "+al.isEmpty());//false
		System.out.println("Total number of elements: "+al.size());//6
		System.out.println("search for 40?: "+al.contains(40));//false
		System.out.println("search for 20?: "+al.contains(20));//true
		
		
		al.add(0,100);
		System.out.println(al);
		//remove element 
		al.remove(5);
		System.out.println(al);
		//get
		System.out.println(al.get(4));//50
		
		//clear entire list
		al.clear();
		System.out.println(al);//[]
		System.out.println(al.size());//0
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
