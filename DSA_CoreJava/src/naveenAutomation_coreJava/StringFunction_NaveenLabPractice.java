package naveenAutomation_coreJava;

public class StringFunction_NaveenLabPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//charAt and IndexOF
		//Java_22_StringBuffer_StringBuilder_StringManipulationMethods_Split_EscapeCharacters.mp4

		String str = "this is my java code and i am so happy";
		
		
		System.out.println(str.charAt(37));
		
		//System.out.println(str.charAt(str.length()));
		
		
		int x= str.indexOf("j");
		
		System.out.println(x);
		
		int i= str.indexOf('j');
		System.out.println(i);
		
		System.out.println(str.indexOf("code"));
		
		System.out.println(str.indexOf("Python"));
		String msg = "welcome admin";
		
		if(!(msg.indexOf("admin")==-1)) {
			
			System.out.println("String is Present");
		}
		else {
			
			System.out.println("inside Else");
		}
		
		
		
		
		
		
		
	}

}
