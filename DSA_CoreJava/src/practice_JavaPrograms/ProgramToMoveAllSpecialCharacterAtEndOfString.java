package practice_JavaPrograms;

public class ProgramToMoveAllSpecialCharacterAtEndOfString {

	
	//Move all special char to the end of the String
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input = "!@$%^  &*AJAY ";
		
		//outPut : AJAY!@$%^&*
		
		String spChar="";
		String normalChar= "";
		
		String expStr="";
		
		String regEx= "[^[a-zA-Z0-9\\S+]]";
		
		char c; 
		
		for(int i=0; i<input.length(); i++) {
			
			c= input.charAt(i);
			
			if(String.valueOf(c).matches(regEx)) {
				
				spChar= spChar+c;
			}
			else {
				normalChar = normalChar+c;
				
			}
			
			
			
			
		}
		
		expStr=normalChar+ spChar;
		System.out.println(expStr);

	}
	

}
