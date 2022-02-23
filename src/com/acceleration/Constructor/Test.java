package com.acceleration.Constructor;

public class Test {

	String name ; // null
	int a; // 0

	public Test(String name,int a) {	
		this.name=name;  //
		this.a=a;	
	}
	
	public Test(String name,int a,int b) {	
		this.name=name;  //
		this.a=a;	
	}
	
	
	public void Demo() {
		System.out.println(name);
		System.out.println(a);		
	}
	

	public static void main(String[] args) {

		Test t1 = new Test("vivek",10);
		t1.Demo();
		
		
		Test t2 = new Test("Bhushan",20,50);
		t2.Demo();
		
	}
//data

}
