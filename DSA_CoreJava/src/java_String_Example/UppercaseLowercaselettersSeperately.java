package java_String_Example;

public class UppercaseLowercaselettersSeperately {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "HanumanRam";
		
		char ch = 'A';
		
		System.out.println('a');
		
		String upperCase= "";
		String lowerCase= "";
		char [] arr = s.toCharArray();
		for(char c: arr) {
			
			if(c>=65 && c <=90) {
			
				System.out.println("char is Upper case"+c);
				
				upperCase  = upperCase+c;
				
				
			}
			else if(c>=97 && c<=122) {
				
				lowerCase = lowerCase+ c;
				
			}
			
			
		}

		  System.out.println(upperCase);
		  
		  System.out.println(lowerCase);
	}

}
