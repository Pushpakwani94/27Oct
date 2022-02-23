package com.pom.Pages;

import java.util.Scanner;

public class ScannerProgram {
	
	//InputMis
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user data as name , age , salary");
		String name = sc.nextLine();
		int age = sc.nextInt();
		double salary = sc.nextDouble();
		
		System.out.println("user name " +name);
		System.out.println("user age " + age);
		System.out.println("user salary " +salary);
	//name
	//age
	//salary
		
		
	}

}
