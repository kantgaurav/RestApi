package pepCoding.String.DSA;

import java.util.Arrays;

public class ReverseAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] input = {6, 7, 4, 51, 2, 3, 9, 77, 8, 4};
		
		Arrays.sort(input);
		
		int [] revArray= reverseAnArray(input);
		   System.out.println(Arrays.toString(revArray));

	}

	
	public static int [] reverseAnArray(int arr[]) {
		
		
		int [] revArr= new int[arr.length];
		
		int k=0;
		for(int i=arr.length-1; i>=0; i--) {
			
			revArr[k]= arr[i];
			k++;
		}
		
		
		
		return revArr;
	}
}
