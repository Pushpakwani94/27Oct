package com.pom.collection;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetProgram {
	
	
	//treeset
	//treemap
	
	    //duplicate value not allowed
		//insertion Not Applicable
		
		//only one null value we can store
		//set interface is child interface for collection interface
	
	public static void main(String[] args) {
		
		SortedSet ts =new TreeSet();
		
		//first()
		//Last();
		//headset();
		//tailset
		//subset
		
		ts.add(501);
		ts.add(500);
		ts.add(503);
		ts.add(508);
		ts.add(515);
		ts.add(520);
		ts.add(507);
		
		
		
		System.out.println(ts.first()); //[500,501,503,507,508,515,520]
		System.out.println(ts.last());
		System.out.println(ts.headSet(508)); // <  508 less than  [500, 501, 503, 507]
		System.out.println(ts.tailSet(508)); //>= greater than [508,515,520]
		System.out.println(ts.subSet(500, 515)); 
		
		System.out.println(ts.subSet(500, 515));
		 
		
		
			
			
		
		
		
	}

}
 