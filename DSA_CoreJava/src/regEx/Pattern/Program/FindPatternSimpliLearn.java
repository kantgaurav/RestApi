package regEx.Pattern.Program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPatternSimpliLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String regEx= "[a-z][0-9]+";
		String input = "aaaad244";
		
		Pattern pattern = Pattern.compile(regEx);
		
		Matcher matcher = pattern.matcher(input);
		
		System.out.println(matcher.find());
		System.out.println(matcher.start());

		System.out.println(matcher.end());
	}

}
