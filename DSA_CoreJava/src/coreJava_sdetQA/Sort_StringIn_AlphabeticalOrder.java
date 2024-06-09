package coreJava_sdetQA;

import java.util.Arrays;

//Sort All character in Alphabetical  Order//RACE

public class Sort_StringIn_AlphabeticalOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "gurudev datta Vittal";
		
		StringBuilder sb = new StringBuilder();
		char arr[] = str.toCharArray();
		
		
		
		for (int i =0; i<arr.length; i++) {
			
			for (int j =i+1 ; j<arr.length; j++) {
				
				if(arr[i]> arr[j]) {
		
					char temp= arr[i];
					
					arr[i]= arr[j];
					
					 arr[j]= temp;
					
					// sb.append(temp);
		
					
					
					
				}
				
				
			}
			
	
		}
		System.out.println(new String(arr));
		//// using Arrays.Sort method : // 
		
		String str1 = "hanumanbajrangi";
		
		char ch[] =  str1.toCharArray();
		
		
		Arrays.sort(ch);
		
		System.out.println(new String(ch));
		
		
		
		

	}

}
