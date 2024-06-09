package java_RegEx_Coding;
import java.util.regex.*;
public class ClassA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Matcher class : function : boolean matches() , boolean find 
		
		Pattern pattern = Pattern.compile("[a-z]+");
		
		System.out.println(pattern.getClass());
		
		//Matcher Object//
		
		Matcher matcher = pattern.matcher("welcometocoding");
		
		System.out.println(matcher);
		
		if(matcher.matches()) {
			
			System.out.println("Successfuly matches");
		}
		else {
			
			System.out.println("Invalid");
		}

		
		
		
		
		
		
		

	}

}
