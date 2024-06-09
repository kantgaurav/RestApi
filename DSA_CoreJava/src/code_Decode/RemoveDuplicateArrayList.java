package code_Decode;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> li= new ArrayList<String>();
		
		
		li.add("Manoj");
		li.add("Ram");
		li.add("Shas");
		li.add("Manoj");
		
		
		Set<String> set = new LinkedHashSet<String>();
		
		set.addAll(li); 
		
		System.out.println(set);
		
	    List<String> arr = new ArrayList<>();
	    
	    arr.addAll(set);
	    
	    System.out.println(arr);
	    
	    //Duplicate element count = //
	    
	    int count =li.size()- set.size();
	    
	    System.out.println(count);

	}

}
