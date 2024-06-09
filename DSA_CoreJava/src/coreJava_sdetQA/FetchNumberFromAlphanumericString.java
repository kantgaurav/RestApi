package coreJava_sdetQA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FetchNumberFromAlphanumericString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String m= "786RamMandir";
		List<Integer> testInt= findNumericValueFromAlphaNumStr(m);
		
		System.out.println(testInt);
		    
		String alphaNum= "ABC786k";
		boolean val= false;
		
		//int xx[] = null ;
		
		List<Integer> xx= new ArrayList<Integer>();
		
		char arr []= alphaNum.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		
  int count=0;
		for (int i= 0; i< arr.length; i++) {
			
			     char c= arr[i];
			     
			     if(Character.isDigit(c)) {
			    	 
			    	 System.out.println("Digit char is :" +c);
			    	 
			    	 val = true;
			    	 
			          xx.add(Character.getNumericValue(c));
			    	 
			    	 count++;
			     }
			     else {
			    	 
			    	 val =false;
			     }
			
		}
		
		System.out.println(val);
		
		System.out.println(xx);
		
		
		
		 


	}
// Converting char to its int Value // 
	  public static List<Integer> findNumericValueFromAlphaNumStr(String alphaNum) {
		  
		   List<Integer> arrInt= new ArrayList<Integer>();
		     //Convert alphaNumericString to Char Arr// 
		  
		         char[]  chArr= alphaNum.toCharArray();
		         
		            for(char c : chArr) {
		            	if(Character.isDigit(c)) {
		            		
		            	int i = c- '0';
		            	System.out.println(i);
		            	
		            	arrInt.add(i);
		            		
		            	}
		            	else {
		            		
		            		System.out.println("Its character :"+ c);
		            	}
		            }
		  
		  return  arrInt;
	  }
	
	
}
