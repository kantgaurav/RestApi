package regEx.Pattern.Program;

import java.util.regex.Pattern;

public class CreateRegExForAlphnumeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     boolean x=Pattern.matches("(^[a-zA-Z0-9]+$){20}", "rishitaKKJSDHWJJWJR1WERGWEUYRTWYTR2");
     System.out.println(x);
	}

}
