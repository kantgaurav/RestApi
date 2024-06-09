package java_String_Example;

public class ExtractSpecificTextFromNumberString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Extract 867 from given String 
		String str = "93486721139";
		
		
		Long lint = Long.parseLong(str);
		
		System.out.println(lint);
		//Step1 :  Find the digit From Starting position to Ending of given number : i e 934867
		
		Long l1= lint/100000;
		System.out.println(l1);
		
		//We found l1 = 934867
		
		//chnage long to int 
		
		int input= l1.intValue();
		
		
		System.out.println(input);
		
		int res= input%1000;
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
