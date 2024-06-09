package java_String_Example;

public class RemoveSpecialCharacer_FromText {
	
	public static void main(String[] args) {
		
		String str= "786$%@#%@HJDASDAS ";
		
		removeSpecialChar(str);
	}
	public static void removeSpecialChar(String s) {
		
		
		int count = 0;
		
		StringBuilder sb = new StringBuilder();
		
		String spRemove= " ";
		
		if(!(s==null) &&s.length()>0) {
			
			char [] arr = s.toCharArray(); 
			
			for(int i=0; i<arr.length; i++) {
				
				if(!Character.isLetterOrDigit(arr[i]) && !Character.isWhitespace(arr[i])) {
					 
					  System.out.println("the char is  speacial");
					  count++;
					  sb.append(arr[i]);
					  
					
					  
				}
				
				else {
					
					System.out.println("Char is general");
					  System.out.println(arr[i]);
					  
					  spRemove= spRemove+s.charAt(i);
					
					
				}
				
			}
			
			if(count==0) {
				
				System.out.println("No Specila Char found");
			}
			else {
				
				System.out.println("the Special char count are" + count);
				
				System.out.println("All the special char are:"+sb);
				
				System.out.println(spRemove);
			}
		}
		
		
	}

}
