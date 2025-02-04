package com.week5_CollectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	/*
	 * LinkedHashSet is class implement Set interface
	 * underline data structure is DoublyLinkedList and HashTable(List+Set)
	 * It is order collection but not based on indexing
	 * It will not allow duplication
	 * 
	 */
	public static void main(String[] args) 
	{
		LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
		ls.add(78);
		ls.add(10);
		ls.add(34);
		ls.add(10);
		ls.add(67);
		ls.add(77);
		ls.add(34);
		
		System.out.println(ls);
		
		System.out.println("Total Elements are: "+ls.size());
		
		System.out.println("Look for 45?: "+ls.contains(45));
		
		
		System.out.println("***********For each loop**********");
		for(Integer i:ls)
		{
			System.out.println(i);
		}
		
		System.out.println("***********For iterator**********");

		Iterator<Integer> ir=ls.iterator();
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		System.out.println("*****************************");
		
		/*
		 * remove duplicate characters
		 * 
		 */
		
		String s1="aabbccddefg";
		System.out.println(s1);
		LinkedHashSet<Character> l1=new LinkedHashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			l1.add(ch);
		}
		
		
		System.out.println(l1);
		
		String res="";
		for(Character i:l1)
		{
			res=res+i;
		}
		
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
		
		

	}

}
