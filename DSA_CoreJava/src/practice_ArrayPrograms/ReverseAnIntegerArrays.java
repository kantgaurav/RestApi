package practice_ArrayPrograms;

import java.util.Arrays;

public class ReverseAnIntegerArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] b = {10,20,30,40};
		
		int []result=  new int[b.length];
		
	reverseIntArray(b);
		
	}

	
	public static int [] reverseIntArray(int orgArr[]) {
		
		int arr[] = {};
		int k=0;
		for (int i =orgArr.length-1; i>=0; i--) {
			
			   arr[k]= orgArr[i];
			   k++;
		}
		
		
		System.out.println(Arrays.toString(arr));
		return arr;
	}
}

