package com.pom.collection;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SplitProgram {
	
public static void main(String[] args) {
	String str="I am from pune and pune is IT HUB, I am staying in Shivaji nagar";
	String[] sr1=str.split(" ");
	
	List<String> list=Arrays.asList(sr1);
	Set<String> st=new HashSet(list);
	Iterator<String> it=st.iterator();
	for(int i=0;i<st.size();i++) {
		String name= it.next();
		System.out.println(name);
	}
}

}
