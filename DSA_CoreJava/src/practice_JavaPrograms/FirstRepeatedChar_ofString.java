package practice_JavaPrograms;

public class FirstRepeatedChar_ofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word= "God is Great";
		
		for(int i =0; i<word.length()-1; i++) {
			
			if(word.charAt(i)==' ') 
				
				continue;
			
			//Inner Loop 
			
			for(int j =i+1; j<word.length(); j++) {
				
				
				if(word.charAt(i)==word.charAt(j)) {
					
					System.out.println("Repeated char Found"+word.charAt(j));
					
					
				}
					
				
				
			}
			
			
		}

	}

}
