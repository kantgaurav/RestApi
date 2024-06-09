package regEx.Pattern.Program;

import java.util.Scanner;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class PanCardValidationRegEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ASOPG3493K
	Scanner sc = new Scanner(System.in);
   System.out.println("Pls enter ur PanCard");
   
   String panCard= sc.nextLine();
   
   System.out.println("PanCard num is:"+panCard);
   
   Pattern  pattern = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]{1}");
   
   Matcher matcher = pattern.matcher(panCard);
   
    if(matcher.matches()) {
    	
    	System.out.println("Valid Pancard");
    }
    else {
    	
    	  System.out.println("Invalid PANCARD");
    }
		

	}

}
