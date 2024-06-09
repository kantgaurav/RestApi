package practice_JavaPrograms;

import java.util.Arrays;

public class ArrangeEvenOdd {
	
	public static void main(String[] args) {
		
		
		
		 int arr [] = {1,3,6,88, 55, 44, 34, 33};
		 
		 int newArr[] = new int[arr.length];
		   int index =0;
		 for (int i =0; i<arr.length; i++) {
			   if(arr[i]%2==0) {
				System.out.println("Even Number");
				   newArr[index++]= arr[i];
				   
			   }
			   
		 }
		 
		 for(int j =0; j<arr.length; j++) {
			 
			 if(arr[j]%2!=0) {
					System.out.println("odd Number");
					   newArr[index++]= arr[j];
					   
				   }
		 }
		 System.out.println(Arrays.toString(newArr));
		 
	}

}
