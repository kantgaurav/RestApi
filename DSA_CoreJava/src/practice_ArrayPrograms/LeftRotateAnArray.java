package practice_ArrayPrograms;

import java.util.Arrays;

public class LeftRotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//left Array Rotate by one place :xhttps://www.youtube.com/watch?v=wvcQg43_V8U&t=380s//
		
		int [] arr = {55, 3,4,5};
		
		//result = {3,,4,5,55};
		
		int temp = arr[0];
		//start from index 1 to  size-1; 
		for(int i =1; i<arr.length; i++) {
			
			
			arr[i-1] = arr[i];
			
			
			
		}
		
		arr[arr.length-1] = temp;
		
	   System.out.println(Arrays.toString(arr));

	}

}
