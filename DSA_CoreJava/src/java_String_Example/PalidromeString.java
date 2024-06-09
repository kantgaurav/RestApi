package java_String_Example;

public class PalidromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String palinDrome= "MadaM";
		String strNull= null;
	boolean val=	isPalinDrome(strNull);
	
	System.out.println(val);

	}

	public static boolean isPalinDrome(String strInput) {

		boolean flag = false;
		
		
		if(strInput==null) 
			return flag;
		
		// Convert String into StringBuilder object
		StringBuilder  sb = new StringBuilder(strInput);
		
		sb.reverse();
		
		
   System.out.println(sb);
   
  flag= sb.toString().equals(strInput);
		

		return flag;
	}

}
