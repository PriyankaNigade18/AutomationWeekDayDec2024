package com.week5_CollectionFramework;

import java.util.TreeSet;

public class TreeSetDemo {
	/*
	 * TreeSet is class implement SortedSet extents Set
	 * Underline data structure is search tree
	 * TreeSet returns sorted set
	 * duplication not allowed
	 * it is not order collection
	 * 
	 */
	public static void main(String[] args) 
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		System.out.println("Is set empty?: "+ts.isEmpty());
		ts.add(10);
		ts.add(6);
		ts.add(3);
		ts.add(8);
		ts.add(9);
		ts.add(1);
		ts.add(4);
		ts.add(15);
		ts.add(7);
		System.out.println("Is set empty?: "+ts.isEmpty());
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println("headset():less than element "+ts.headSet(10));
		System.out.println("tailSet(): greater and equal: "+ts.tailSet(10));
		System.out.println("subset(): "+ts.subSet(7,15));
		
		ts.remove(9);
		System.out.println(ts);
		
		
		
	}

}
