package com.pom.string;

public class CommonMethod {
	public static String reverString(String str1) {
		String str = str1;
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

}
