package collection.map;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateUsing_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {89,11, 67, 89, 11, 2,11,22,2,};
		
		findDuplicateUsingHashSet(arr);
	}
	
	private static void findDuplicateUsingHashSet(int arr[]) {
	
//Cannot find Count with Set 
		Set<Integer> set =  new HashSet<>();
		
		for(int x: arr) {
			int count =1;
			if(!set.add(x)) {
				count+=count;
				
				System.out.println("Duplicate element is :"+x+ "And count is:"+count );
				
			}
			
		}
		
		System.out.println(set.toString());
	}

}
