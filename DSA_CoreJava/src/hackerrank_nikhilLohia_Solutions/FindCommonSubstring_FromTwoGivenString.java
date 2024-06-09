package hackerrank_nikhilLohia_Solutions;

import java.util.HashSet;
import java.util.Set;

public class FindCommonSubstring_FromTwoGivenString {

	
	/*
	 * Two Strings is a programming challenge on HackerRank. You are given with two
	 * strings, determine if they share a common sub-string. A substring may be as
	 * small as just one character.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s1= "facebook";
		
		String s2= "checkbook";
		
	String common=	findCommonSubString_FromTwoGivenString(s1, s2);
	
	System.out.println("Common String is:" +common.toString());

	}
	
	
	public static String findCommonSubString_FromTwoGivenString(String s1, String s2) {
		
		String comStr= "";
		
		
		Set<Character>set1 = new HashSet<Character>();
		
		Set<Character>set2 = new HashSet<Character>();
		
		
		for(char c : s1.toCharArray()) {
			
			set1.add(c);
		}
		
		System.out.println("Print  1st  Set");
		System.out.println(set1);
		
	for(char c : s2.toCharArray()) {
			
			set2.add(c);
		}
		
	System.out.println("Print 2nd Set");
	System.out.println(set2);
		// Store the set Intersection in set1
	set1.retainAll(set2);
		
	
	if(!set1.isEmpty()) {
		comStr = comStr+set1.toString();
		return comStr;
	}
		return comStr;
	}
	
	

}
