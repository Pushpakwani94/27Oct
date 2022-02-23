package com.pom.collection;

import java.util.ArrayList;
import java.util.Collections;

public class EvenAndOddNumberProgramUsingArrayList {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 2, 12, 8, 7, 15, 6, 5, 84 };
		ArrayList<Integer> evenList = new ArrayList<Integer>();
		ArrayList<Integer> oddList = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] % 2 == 0) {

				evenList.add(arr[i]);

			} else {
				oddList.add(arr[i]);
			}
		}
		
		Collections.sort(evenList);
		Collections.sort(oddList);
		
		System.out.println(evenList);
		System.out.println(oddList);	
		
		
		for (Integer value : evenList) {
			
			System.out.println(value);
			
		}
		
		

	}

}
