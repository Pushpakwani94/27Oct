package com.pom.collection;

import java.util.TreeSet;

public class TreeSetProgram {
	
	public static void main(String[] args) {
		//Ceiling(10) (greater)
		//floor    (lower)
		//higher  (greater)
		//lower   (lower)
		//pollFirst();
		//pollLast();
		//first
		//last
		//descendingSet()
			
		TreeSet s=new TreeSet();
		
		s.add(10);
		s.add(25);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		//System.out.println(s.hashCode());
		
		for (Object object : s) {
			System.out.println(object.toString());
			
		}
		
		
		
		
		System.out.println(s);
		System.out.println(s.descendingSet());
	
		/*
		 * System.out.println("Ceiling methods "+s.ceiling(25)); //25 >=
		 * System.out.println("higher methods  " +s.higher(50)); //60 >
		 * 
		 * System.out.println("floor methods  " +s.floor(20)); //10 <=
		 * System.out.println("lower methods  " +s.lower(10)); //10 <
		 * 
		 * System.out.println("Ceiling methods "+s.ceiling(60)); //60
		 * System.out.println("higher methods  " +s.higher(60));
		 * 
		 * System.out.println("orignal list of Treeset " +s);
		 * System.out.println("remove First Elemets" + s.pollFirst()); //remove
		 * System.out.println("remove Last Elemets" + s.pollLast());
		 * 
		 * System.out.println("orignal list of Treeset " +s);
		 * 
		 * 
		 * System.out.println(s.first()); System.out.println(s.last());
		 */
	}
	

}
