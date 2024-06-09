package practice_JavaPrograms;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strArr1 [] = {"Phys", "Maths", "Chem"};
		String strArr2 [] = {"History", "Social", "rin"};
		
		mergeArrayString(strArr1, strArr2);
		
		
	}
	
	public static void mergeArrayString(String arr1[], String arr2[]) {
		
		int l1= arr1.length;
		 int l2= arr2.length;
		 
		 
		 String arr[] = new String[l1+l2];
		 
		 for(int i=0; i<l1; i++ ) {
			 
			 
			   arr[i]= arr1[i];
			 
		 }
		
		 for(int j =0; j<l2; j++) {
			 
			 arr[l1+j]= arr2[j];
		 }
		 
		 System.out.println(Arrays.toString(arr));
	}
	

}
