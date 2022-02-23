package com.pom.collection;

import java.util.LinkedList;

public class LinkedListProgram {
	
	public static void main(String[] args) {
		
		LinkedList link =new LinkedList();
		link.add("A");
		link.add("A");
		link.add("B");
		link.add("C");
		//link.add("D");
		link.add(0, "D");
		System.out.println(link.hashCode());
		
		link.addFirst("G");
		link.addLast("T");
		
        System.out.println(link);
		System.out.println(link.peekFirst());
		System.out.println(link.peekLast());
		System.out.println(link.pollFirst());
		System.out.println(link.pollLast());
		
		 System.out.println(link);
		
		
	}
	

}
