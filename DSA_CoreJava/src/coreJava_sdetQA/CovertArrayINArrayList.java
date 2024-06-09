package coreJava_sdetQA;

import java.util.Arrays;

public class CovertArrayINArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {23, 67, 89, 66};
		
		System.out.println(arr);
		
		System.out.println(Arrays.toString(arr));
		
	//Using Stream 
		Arrays.stream(arr).forEach(System.out:: print);
		
		//Convert  int ARRAY into ArrayList
		
		
	Integer inArr[]=	Arrays.stream(arr).boxed().toArray(Integer[]:: new);
	
	System.out.println(Arrays.asList(inArr));
		

	}

}
