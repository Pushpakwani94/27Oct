package com.pom.Demo;

public class Methods {
    int p;
	
	
	int a;
	int b;
	int c;	
	public Methods() {

	}
	public Methods(int b, int c) {
		this.b = b;
		this.c = c;
	}

	public Methods(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;

	}

	public void Display() {
		System.out.println(b);
		System.out.println(c);
		System.out.println(a);

	}

	public static void main(String[] args) {
		Methods obj = new Methods();
		Methods obj3 = new Methods();
		
		Methods obj1 = new Methods(10, 20);
		Methods obj2 = new Methods(20, 30, 70);

		obj2.Display();

	}

}
