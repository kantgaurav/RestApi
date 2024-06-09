package coreJava.ArunArora.udemy;

import java.util.Arrays;

public class TwoDArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//section 437 : 
		
		int arr [] = new int [15];
		
		for (int i =0; i<=5; i++) {
			
			arr[i] = (int) (Math.random()*10);
			
			System.out.println(arr[i]);
			
		}
		
  System.out.println(Arrays.toString(arr));
	}

}
