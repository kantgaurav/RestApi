package coreJava_sdetQA;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate_FromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> li= new ArrayList<Integer>();
		
		li.add(9);
		li.add(10);
		li.add(11);
		li.add(9);
		li.add(41);
		li.add(42);
		
		System.out.println(li);
		
		Set<Integer> set =  new HashSet<Integer>();
		
		set.addAll(li);
		
		System.out.println(set);
		

	}

}
