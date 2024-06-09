package pepCoding.String.DSA;

import java.util.ArrayList;
import java.util.List;

public class SubStringFromAGivenString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "abcd";
    List<String> finalRes = new ArrayList<String>();
    finalRes =findAllSubStringFromGivenInput(input);
		
		for(String s: finalRes) {
			
			System.out.println(s);
		}
		
		

	}

	
	 private static ArrayList<String>  findAllSubStringFromGivenInput(String input) {
		 
		 String res="";
		 
		List<String> allSubStr= new ArrayList<String>();
		 
		int len= input.length();
		
		for(int i=0; i<len; i++) {
			
			
			for(int j =i+1; j<=len;j++) {
				
				res= input.substring(i, j);
				
				System.out.println(res);
				allSubStr.add(res);
				
			}
			
			System.out.println("For the next:" +i);
			
		
			
			
		}
		 
		 
		     
		 
		 
		 return (ArrayList<String>) allSubStr;
	 }
}
