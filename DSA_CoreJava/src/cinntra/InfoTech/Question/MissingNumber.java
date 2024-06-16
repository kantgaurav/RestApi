package cinntra.InfoTech.Question;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int arr[] = {5, 8, 9,7,1,3,15};
		
		Arrays.sort(arr);
	   System.out.println("Array is ascending Order :"+Arrays.toString(arr)); 
	   
	   for (int i =0; i<arr.length-1; i++) {
		   
		   for(int  j=arr[i]+1;j<arr[i+1]; j++) {
			   
			   System.out.println("Missing Number is:"+j);
			   
			   
		   }
		   
		   
	   }

	}

}
