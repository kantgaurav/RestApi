package java_String_Example;

public class EmptyVsBlank_String {
	
	//https://www.youtube.com/watch?v=W7W8IATz_U4
	public static void main(String[] args) {
		
		
		//emty String 
		
		String empty = ""; 
		
		
		System.out.println(empty.isEmpty());
		
		
		String blank = " ";
		
		System.out.println(blank.isBlank());
		
		String name = "Ram ";
		
		System.out.println(name.isBlank());
		System.out.println(name.isEmpty());
		
	}

}
