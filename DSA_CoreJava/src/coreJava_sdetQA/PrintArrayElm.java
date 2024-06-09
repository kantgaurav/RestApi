package coreJava_sdetQA;

import java.util.Arrays;

public class PrintArrayElm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {9, 7, 0, 2,7,6,1,4, 9, 7};
		//  BY using To String method
		System.out.println(Arrays.toString(a));
		
		//By Using FOR loop //
		
		
		for (int x : a) {
			
			System.out.print(x);
			
			
		}
		System.out.println();
		///Sort Element of Arrrays // 
		
		
		Arrays.sort(a);
		
		System.out.println("AFter Sorting"+Arrays.toString(a));
		
		

	}

}
