package com.week5_CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {

	/*
	 * LinkedList is class implement List interface
	 * Underline data structure is Doubly linkedList
	 * It is order collection
	 * Duplication allowed
	 * It adds elements as per node
	 * Frequent operation is data insertion and deletion
	 * node
	 * ==========
	 * address of first/prev node |data|address of next element
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LinkedList<Integer> l1=new LinkedList<Integer>();
		
		if(l1.isEmpty())
		{
			l1.add(100);
			l1.add(200);
			l1.add(300);
			l1.add(400);
			l1.add(400);
			
		}
		
		System.out.println("Is list empty?: "+l1.isEmpty());
		System.out.println("Total Elements are: "+l1.size());
		System.out.println(l1);
		
		l1.addFirst(90);
		l1.addLast(778);
		
		System.out.println(l1);
		
		System.out.println("search for 200?: "+l1.contains(200));
		//remove
		l1.remove(4);
		System.out.println(l1);
		l1.add(0,55);
		System.out.println(l1);
		
		System.out.println("*******Iteration using for loop*********");
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
		System.out.println("*******Iteration using foreach loop*********");
		for(Integer i:l1)
		{
			System.out.println(i);
		}
		System.out.println("*******Iteration using iterator()*********");
		
		Iterator<Integer> ir=l1.iterator();	
		
		while(ir.hasNext())
		{
			System.out.println(ir.next());
		}
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
