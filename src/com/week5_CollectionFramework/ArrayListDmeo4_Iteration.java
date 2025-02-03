package com.week5_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDmeo4_Iteration {
	/*
	 * ArrayList is class implements List interface
	 * ArrayList underline data structure is Dynamic array
	 * ArrayList is order collection,is based on indexing
	 * Duplication allowed
	 * It is non synchronize
	 * Default capacity for ArrayList is 10
	 * Frequent operation is data retrieval
	 * 
	 * Iteration
	 * ===============
	 * 1.using for loop
	 * 2.using for each loop
	 * 3.iterator()
	 */
	public static void main(String[] args) 
	{
	ArrayList<Integer> al=new ArrayList<Integer>();
	
	al.add(56);
	al.add(45);
	al.add(66);
	al.add(10);
	al.add(83);
	al.add(33);
	al.add(20);
	
	System.out.println(al);
	
	System.out.println("**********Iteration using for loop***********");

	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	System.out.println("**********Iteration using for each loop***********");

		for(Integer i:al)
		{
			System.out.println(i);
		}
	
		System.out.println("**********Iteration using iterator() loop***********");

	/*
	 * iterator is method in Collection
	 * It return Iterator interface object
	 * This interface provides two method
	 * 1.hasNext(): it check list contains any element
	 * Returns true if the iteration has more elements
	 * 2.next(): return next element and counter will be incremented by one
	 * Returns true if the iteration has more elements 
	 */
	
		Iterator<Integer> ir=al.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	}

}
