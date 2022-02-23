package com.pom.oops;

import java.util.ArrayList;

public class GrandParent {

	public int addition(int a,int b) {	
		int sum =a+b;
		return sum;
	}

	public float addition(int a ,int b ,float c) {
		float sum = a+b+c;		
		return sum;

	}
	
	public void wish() {
		
		System.out.println("good morning");
	}
	

	
	public static void main(String[] args) {
		GrandParent obj =new GrandParent();
		
		int value = obj.addition(20, 30);
		System.out.println(value);

		
		
		
		float result = obj.addition(10,40,8.0f);
		System.out.println(result);
		
	}

}
