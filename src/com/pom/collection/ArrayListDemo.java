package com.pom.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {
	//add
	//add(index);
	//addAll(Collection);
	//clear();
	//get
	//remove();
	//size()
	//conatins
	//set 
	//isEmpty
	
	//curd   
	
	   //add
	   //set
	   //get
	   //remove
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList list1=new ArrayList();
		list1.add("banana");
		list1.add("Lemon");
			
	
		
	  
		ArrayList list=new ArrayList();//[Apple,cherry,orange,banana,Lemon]
		list.add("Apple");
		list.add("orange");
		list.add(1,"cherry");
		list.addAll(list1);
		
		list.set(2, "strawbeery");
		
		System.out.println(list);
		
		for (int i = 0; i < list.size(); i++) {
			Object data = list.get(i);
			System.out.println(data.toString());
				
		}
		
		
		
		boolean result = list.contains("banana1");
		
		System.out.println(result);
		 
		list.clear();//[]
		
		
		boolean reult1 = list.isEmpty();
		System.out.println("arraylist is not empty " + reult1);
 
		
		
		
		

	}
	

}
