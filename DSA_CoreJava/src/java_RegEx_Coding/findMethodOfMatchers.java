package java_RegEx_Coding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class findMethodOfMatchers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Welcome to My Company";
		Pattern pattern = Pattern.compile("[a-z]+");
		
		Matcher matcher = pattern.matcher(str);
		
		while(matcher.find()) {
			
			//System.out.println(matcher.start());
			//System.out.println(matcher.end());
			
			System.out.println(str.substring(matcher.start(), matcher.end()));
			
		}
		

	}

}
