package practice_ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr= {1, 2, 3, 4, 2, 3,5, 6,3};
		
		printDupliateIntFromArray(arr);

	}
	
	
	public static  void printDupliateIntFromArray(int []arr) {
		
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			//
			for(int j = i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					
					System.out.println("duplicate Found "+arr[j]);
					list.add(arr[i]);
				}
				
			}
			
		}
		
		System.out.println(list);
	}

}
