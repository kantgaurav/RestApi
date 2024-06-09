package java_String_Example;

public class UppercaseLowercaselettersSeperately_UsingCharFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  str = "Ramayan Maruti";
		
		String strArr[]=findUpperAndLowerCaseString(str);
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
	}
	
	
	public static String [] findUpperAndLowerCaseString(String input) {
		
		String arr[]  = new String [2];
		
		String lowerCase= "";
		String upperCase= "";
		char  cArr[] = input.toCharArray(); 
		
		for(int i =0; i<input.length(); i++) {
			
			if(Character.isLowerCase(cArr[i])) {
				
				lowerCase = lowerCase+cArr[i];
				
				
			}
			if(Character.isUpperCase(input.charAt(i))) {
				
				upperCase = upperCase+input.charAt(i);
			}
		}
		
		arr[0]= lowerCase; 
		arr[1] = upperCase;
		return arr;
	}

}
