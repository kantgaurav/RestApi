package java_String_Example;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatefromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Prrivaacyy";
     
		Set<Character> set = new LinkedHashSet<Character>();
		int count =0;
		for(int k=0; k<str.length(); k++) {
			
			if(!set.add(str.charAt(k))){
				
				System.out.println("Duplicate char is :"+str.charAt(k));
				count++;
			}
		}
		System.out.println("Number of Duplicate char"+count);
		System.out.println(set.toString());
	}

}
