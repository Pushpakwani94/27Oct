package com.pom.oops;

public class Parent extends GrandParent {

	// method overriding

	/*
	 * public void wish() {
	 * 
	 * System.out.println("good morning"); }
	 */
	
	//grandParent method
	  //wish
	  //additin(int a, int b)
	  //addition(int a,int b,int c);
	
	//parent
	public void wish() {
		System.out.println("good evening");

	}
	
	public static void main(String[] args) {
		
		Parent obj =new Parent();
		obj.wish();
	}

}
