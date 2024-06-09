package practice_ArrayPrograms;

import java.util.Arrays;
public class SortHalfArrayInAscendingDescendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int [] arr = {1, 3,2, 4, 6, 5};
		
		System.arraycopy(args, 0, arr, 0, 0);
		
		int n = arr.length;
		int temp[] = new int[n];
		Arrays.sort(arr);
		
		int k=0;
		for(int i = 0; i<n/2; i++) {
			
			System.out.println(arr[i]);
			temp[k] =arr[i];
			k++;
		}
	   
		for(int j= n-1; j>=n/2;j--) {
			
			System.out.println(arr[j]);
			temp[k]= arr[j];
			k++;
		}
	System.out.println(Arrays.toString(temp));	
	}
   

}

