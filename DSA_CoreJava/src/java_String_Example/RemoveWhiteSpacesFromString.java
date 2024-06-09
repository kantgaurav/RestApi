package java_String_Example;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "	What is ur 		Name in 	School?";
		// Escape sequences 
		
		str= str.replaceAll("\\s", "");
		
		System.out.println(str);
	}

}
