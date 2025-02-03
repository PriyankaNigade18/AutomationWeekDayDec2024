package com.week5_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class CollectionsClassDemo {

	public static void main(String[] args)
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(90);
		al.add(20);
		al.add(77);
		al.add(10);
		al.add(89);
		al.add(15);
		al.add(90);
		al.add(20);
		al.add(15);
		
		System.out.println(al);
		
		Collections.sort(al);
		
		System.out.println(al);
		
		System.out.println("Min element: "+Collections.min(al));
		System.out.println("Max element: "+Collections.max(al));
		
		
		/*
		 *lets write code to remove duplicate elements from list
		 *Ans: convert list into set
		 *1.using addAll()
		 *2.using constructor
		 */
		
		System.out.println(al);
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.addAll(al);
		
		System.out.println(hs);
		

		/*
		 * how to sort any set
		 * =========================
		 * solution 1:  convert set into list and use sort method
		 * Solution2: convert set into treeset
		 */
		/*
		List<Integer> l1=new ArrayList<Integer>(hs);
		
		System.out.println(l1);
		
		Collections.sort(l1);
		
		System.out.println(l1);
		
		*/
		System.out.println(hs);
		
		TreeSet<Integer> ts=new TreeSet<Integer>(hs);
		
		System.out.println(ts);
		
		
		
		
		
		
		
		
		
		

	}

}
