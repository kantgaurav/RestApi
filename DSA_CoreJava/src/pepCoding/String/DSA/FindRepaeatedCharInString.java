package pepCoding.String.DSA;

import java.util.Scanner;

public class FindRepaeatedCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		  System.out.println("please provide String");
	       Scanner sc = new Scanner(System.in);
	       String s= sc.nextLine();
	       
	     
	       char c =Character.MIN_VALUE;
	       
	       
	       for(int i=0; i<s.length(); i++){
	           
	           for(int j=i+1;j<=s.length(); j++){
	           
	              int count =0; 
	              
	              if(s.charAt(i)==s.charAt(j)){
	                  
	                  System.out.println("Duplicate Char is found" +s.charAt(i));
	                  count++;
	              }
	               
	           }
	       }
	}

	}

