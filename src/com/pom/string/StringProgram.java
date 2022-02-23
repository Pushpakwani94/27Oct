package com.pom.string;

public class StringProgram {
	
	CommonMethod commonMethod;

	public boolean palindrome(String data) {
		// madam
		String str = data; // 141
		 // 141
		
		commonMethod =new CommonMethod();
		String result = commonMethod.reverString(str);
		

		if (str.equals(result)) {

			return true;
			
		} else {
			return false;
		}
	}
	
	public void test() {
		
		commonMethod.reverString("ABCDS");
		
	}
	
	
	


	
}
