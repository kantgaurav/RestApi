package practice_ArrayPrograms;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
//https://www.youtube.com/watch?v=kgpxMsNBlnM&t=181s
public class RemoveDupFromArr {
	
	public static void main(String[] args) {
		
		
		int ar[] = {4,6,5,4,6,5,8};
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		   // Using for Loop add 
		
		for(int i : ar) {
			
			set.add(i);
		}
		
		 Integer [] inArr= set.toArray(new Integer[set.size()]);
		 
		 System.out.println(Arrays.asList(inArr));
	}

}
