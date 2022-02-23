package com.acceleration.methods;

public class ThisAndSuper {
	
	int gold=20;
	
	public void home() {
		
		int a=10;
		System.out.println("this is local variable  "+a); //10
		System.out.println("this is Global variable using this keyword  " + this.gold); //20
		
		
	}
	
	
	public static void main(String[] args) {
		ThisAndSuper obj =new ThisAndSuper();
		obj.home();
		
		
	}
	
	
	

}
