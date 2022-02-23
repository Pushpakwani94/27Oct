package com.pom.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class HashsetProgram {
	
	
	//duplicate value not allowed
	//insertion order not preserved
	//hetrogenoius data allowed
	//only one null value we can store
	//set interface is child interface for collection interface
	
	public static void main(String[] args) {
		
		HashSet h =new HashSet();
		
		h.add("D");
		h.add("C");
		h.add("B");
		h.add("Y");
		h.add(null);
		h.add(null);
		h.add(10);
		h.add("B");
		h.add("@");
		
		//SortedSet ts =new TreeSet(h);
		
		System.out.println(h); // [null, @, B, C, D, Y, 10]
		
		
	}
	
	
	
	

}
