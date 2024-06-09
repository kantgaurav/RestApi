package coreJava_sdetQA;

import java.util.Arrays;

public class SortingCharAndStringArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String str[] = {"Aazeen", "Rida","Khatiza", "Amina" , "SUHANI"};
		
		//char str[]= {'S', 'U', 'H', 'A', 'N', 'I'};
		
		Arrays.sort(str);
		
		System.out.println("AFTER SORTING");
		
		System.out.println(Arrays.toString(str));

	}

}
