package com.week5_CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
		/*
		 * HashSet is class implement Set interface
		 * underline data structure is HashTable
		 * HashTable store elements as per hash function(Key ,index)
		 * Duplicate elements not allowed
		 * It is an un-order Set
		 * Initial capacity for Hashset/HashMap is 16location
		 * Node
		 * |key|hashcode|data|addressofNextElement|
		 * hashcode and indexing for null is 0
		 */
	public static void main(String[] args)
	{

		HashSet<Integer> hs=new HashSet<Integer>();
		System.out.println("Is set empty?: "+hs.isEmpty());
		hs.add(100);
		hs.add(200);
		hs.add(300);
		hs.add(400);
		hs.add(500);
		hs.add(200);
		hs.add(null);
		
		System.out.println("Set is Empty?: "+hs.isEmpty());
		System.out.println(hs);
		System.out.println("Total Elements are: "+hs.size());
		
		System.out.println("Look for 300?: "+hs.contains(300));
		
		hs.remove(null);
		
		System.out.println(hs);
		
		//hs.clear();
//		System.out.println(hs);//[]
//		System.out.println(hs.size());//0
//		
		System.out.println("****Iteration using for each loop*****");
		
		for(Integer i:hs)
		{
			System.out.println(i);
		}
		
		System.out.println("****Iteration using iterator()*****");

		
		Iterator<Integer> ir=hs.iterator();
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		

	}

}
