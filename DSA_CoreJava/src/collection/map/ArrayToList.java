package collection.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub88
		
		int [] arr = {66,67, 34, 11};
		
		List<int[]> li= List.of(arr);
		
		System.out.println(li.toArray());
		
  // uSING Stream Function
		
		List<Integer> liOfInt = new ArrayList(Arrays.stream(arr).boxed().toList());
		
		Collections.sort(liOfInt);
		
		System.out.println(liOfInt);
		
		
		
		
	}

}
