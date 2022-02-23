package com.pom.oops;

public class Child extends Parent{
	//addition();
	//test1();
	public void car() {
		System.out.println("child method");
		
	}


	
	public static void main(String[] args) {
		Child obj=new Child();
		//obj.addition(); //GrandParent
		//obj.test1(); //parent
		obj.car();  //child
		
		
	
	}

}
