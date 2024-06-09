package practice_ArrayPrograms;

import java.util.Arrays;

public class ArrayWithDefaultDec {

	//Jagged Array ; 
	//we can create a 2-D array but with a variable number of columns in each row. 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr [][] = {{1,2,3}, {4,5}, {6,7,8,9}};
		
		
		System.out.println(arr[0].length);
		System.out.println(arr[1].length);
		System.out.println(arr[2].length);
		
		System.out.println(arr.length);
		    
    // Enhanced For Loop// 
		System.out.println("Enhanced for Loop");
		for ( int[] a: arr) {
			 
			System.out.println(Arrays.toString(a));
		}
		
	    for (int i =0; i<arr.length; i++)	{
	    	
	    	
	    	for (int j =0; j<arr[i].length; j++) {
	    		  System.out.print("  "+arr[i][j]);
	    	}
	    	System.out.println();
	    }
	}

}
