package java_String_Example;

import java.util.Arrays;

public class SortingAStringChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String str = "vegetable ";
		
		char[] arr = str.toCharArray();
		char temp;
		for(int i =0; i<str.length(); i++) {
			
			for(int j = i+1; j<str.length(); j++) {
				
				if(arr[i]>arr[j]) {
					
					temp= arr[i];
					
					  arr[i]= arr[j];
					   arr[j] = temp;
					   
					
					
				}
			}
			System.out.println(new String(arr));
		}
		System.out.println("Sorted Char"+Arrays.toString(arr));

	}

}
