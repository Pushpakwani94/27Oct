package com.pom.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	//ouput
			/*
			 * i :2 
			 * am :2 
			 * java :2 
			 * developer :1 
			 * and : 1
			 */
	
	//jva program to count thae occurance of each word in string using hashmap
	public static void main(String[] args) {
		String str="i am  a java developer and i am doining java with selenium";	
		String[] newString = str.split(" ");
		HashMap<String ,Integer> wordcountmap =new HashMap<String,Integer>();   
																					                                                                       
		for(String data:newString) {  
			
			  if(wordcountmap.containsKey(data)) {
				  
				  wordcountmap.put(data,wordcountmap.get(data) + 1);
			  }
			  else
			  {
				  wordcountmap.put(data, 1);			  
			  }		
		}
			
		for (Map.Entry<String, Integer> data1 : wordcountmap.entrySet()) {	
			System.out.println(data1.getKey()  + " : " + data1.getValue());
				
		}
		
		
		
		
		
		
	} 

}
