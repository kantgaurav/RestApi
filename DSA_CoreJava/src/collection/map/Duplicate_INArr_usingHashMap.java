package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_INArr_usingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {89,11, 67, 89, 11, 2,11,22,2,};
		
		findDuplicateUsingHashMap(arr);

	}
	
private  static void findDuplicateUsingHashMap(int arr[]) {
	
	//int size = arr.length;
	
	Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
	for(int x: arr) {
	if(map1.containsKey(x)) {
		
		map1.put(x, map1.get(x)+1);
	}
	else {
		
		map1.put(x, 1);
	}
	
	}
	
		for(  Integer i: map1.keySet()) {
			
			if(map1.get(i)>1) {
				
				
				System.out.println("Duplicate value is:"+ i+ " with count  "+map1.get(i));
			}
			
			
		}
	}

}
