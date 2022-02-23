package com.pom.oops;

public class Dog  extends Animal{
	
	public void walking() {
		
		System.out.println("walking");
	}
	
	
	
	
	
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.walking();
		d1.eat();
		
		//Dog d2=new Animal();// not allowed
		
		
		
		
		
	}
	

}
