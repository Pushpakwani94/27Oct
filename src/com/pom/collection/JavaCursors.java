package com.pom.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class JavaCursors {
	
	//Enumeration  // read write  
	//Iterator     //read write remove   forward direction
	//ListIterator  //read write remove   both direction
	
	
	public static void main(String[] args) {
		ArrayList list=new ArrayList();//[Apple,cherry,orange,banana,Lemon]
		list.add(1);
		list.add(2);
		list.add(8);
		list.add(9);
		list.add(14);

		
		 ListIterator data = list.listIterator();
	  
		 
		 while(data.hasNext())
		 {
			    	 
			  int data1 = (int)data.next(); //10
			  String value = Integer.toString(data1); //"10"
			  
		 }
		 
		
		
		
		

		
		
		
		
	}
	

}
