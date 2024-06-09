package practice_JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedWordofSentence_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentences= "what i think  Do u think same ";
		
		String words[] = sentences.split(" ");
		
		Set<String> set = new HashSet<String>();
		
		
		for(int i=0; i<words.length;i++) {
			
			if(!set.add(words[i])) {
				
				System.out.println("Repated word is:"+ words[i]);
				break;
			}
			
		}
		
		
		

	}
	
	public String getFirstRepeatedWord(String sentences) {
		
      String words[] = sentences.split(" ");
      
      Set<String> set= new HashSet<String>();
	for(int i=0; i<words.length; i++) {	
   if(set.contains(words[i])) {
			
		return words[i];	
		}
    set.add(words[i]);
	}
		
		return "";
		
		
	}
	
	
	

}
