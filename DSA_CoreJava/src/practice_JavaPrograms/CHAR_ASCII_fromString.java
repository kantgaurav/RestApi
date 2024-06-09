package practice_JavaPrograms;

public class CHAR_ASCII_fromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "AbcXYZ+88238";
		
		
	  stringCharAscii(str);
		
		

	}
	
	
	public static void stringCharAscii(String charStr) {
		
		
		for(int i = 0; i<charStr.length(); i++) {
			
			
			char c = charStr.toCharArray()[i];
			
			byte chAsciNum= charStr.getBytes()[i];
			
			 int x = c;
			System.out.print("Char is : "+ c +" ,"+"Ascii value is:"+ x);
			
			System.out.println(chAsciNum);
			
			
		}
		
		
		
	}

}
