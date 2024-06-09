package com.practice.com.demo_proj2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOfEachCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  //getCharCount("morning is awesome");
		  getCharCount("shashikant  gaurav");
	}
	
	public static void getCharCount(String str) {
		
		   char []strArr= str.toCharArray();
		   
		   Map<Character, Integer> hm= new HashMap<Character, Integer>();
		    
		        for(char c : strArr) {
		        	if(!String.valueOf(c).isBlank()) {
		        	if(hm.containsKey(c)) {
		        		
		        		hm.put(c, hm.get(c)+1);
		        	}
		        	else {
		        	hm.put(c, 1);
		        	
		        	
		        }
	}
   System.out.println("The Map is "+hm);
   // Print  keySet from HashMap 
   
      Set<Character> set = hm.keySet();
      System.out.println(set);
      System.out.println(hm.values());
      //Iterating HashMap 
      
        for( Character s: hm.keySet()) {
        	   System.out.println("key is " + s +" &"+"Value is " +hm.get(s));
        }
	}
}
}