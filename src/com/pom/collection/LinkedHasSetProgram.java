package com.pom.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHasSetProgram {
	
	    //duplicate value not allowed
		//insertion order is preserved
		//hetrogenoius data allowed
		//only one null value we can store
		//set interface is child interface for collection interface
	
	public static void main(String[] args) {
		
		LinkedHashSet h =new LinkedHashSet();
		
		h.add("D");
		h.add("C");
		h.add("B");
		h.add("Y");
		h.add(null);
		h.add(null);
		h.add(10);
		h.add("B");
		h.add("@");
		
		System.out.println(h); //[D,c,B,Y,Null,10,@]
		
	}

}
