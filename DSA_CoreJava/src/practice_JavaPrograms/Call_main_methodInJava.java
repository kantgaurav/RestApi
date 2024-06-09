package practice_JavaPrograms;

import java.util.Arrays;

public class Call_main_methodInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
callmainMethod();
System.out.println(Arrays.toString(args));
System.out.println("Main method called");

	}
	
	
	public static  void callmainMethod() {
		
		System.out.println("Sample method");
		
		String [] str= {"AAA", "jJJ", "K"};
		
		main(str);
		
		
	}

}
