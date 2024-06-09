package practice_ArrayPrograms;

import java.util.Arrays;

public class FinalArray_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final int[] arr = {1,2,3};
		//We can modify the final object's properties
		 arr[1]= 5;
		 
		 System.out.println(Arrays.toString(arr));
		 
		//We cannot modify the final refernce, see below example 
		 int[] arr2 = {45,6, 7};
		 
		// arr= arr2;
		 
		 
		 
		 


	}

}
