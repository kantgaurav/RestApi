package cinntra.InfoTech.Question;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "concatenation";
		
	char[] ch = str.toCharArray();
	
	Set<Character> set = new LinkedHashSet<Character>();
	
	for(Character c: ch) {
		
		set.add(c);
		
	}
  System.out.println(set);
	}

}
