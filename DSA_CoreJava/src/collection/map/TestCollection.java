package collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestCollection {
	
	public static void main(String[] args) {
		
		
		List<Integer> li1= new ArrayList<>();
		
		Collections.addAll(li1, 2,3,34,5);
		
		System.out.println(li1);
		
		Set<String> set = new HashSet<>();
		set.add("AshokIT");
		
	Collections.singleton(set);
	
	set.add("Test IT");
	
	System.out.println(set);
	
	}

}
