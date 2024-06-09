package coreJava_sdetQA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]  arr= {9, 8, 98, 7, 8, 6, 0,1,2,3};
		
	//Using Temp Array// 
		
		int temp[] = new int [arr.length];
		
		int i=1;
		for(int j = 0; j<arr.length; j++) {
			
			
			temp[arr.length-i]= arr[j];
			
			i++;
			
		}
   System.out.println(Arrays.toString(temp));
   
   //	//Using Collection Reverse methid 
	
    int arr1[]= {0,1,2,3,4,5};
    
    
    //Chnage to ArrayLsit
    

    
   
   
   
	}
	

	

}
