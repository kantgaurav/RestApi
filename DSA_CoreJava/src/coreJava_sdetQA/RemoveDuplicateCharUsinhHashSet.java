package coreJava_sdetQA;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharUsinhHashSet {
	
	
	static String str = "webdriver";
	public static void main(String[] args) {
		
		StringBuilder  sb = new StringBuilder();
		
		Set<Character> st = new LinkedHashSet<Character>();
		
		int i;
		for(i =0; i<str.length(); i++) {
			boolean status = false;
			status =st.add(str.charAt(i));
			
			if(!status) {
				
				System.out.println("Duplicate Char is:"+ str.charAt(i));
			}
			
		}
		System.out.println("Without Duplicate char"+ st.toString());
	}
	
	

}
