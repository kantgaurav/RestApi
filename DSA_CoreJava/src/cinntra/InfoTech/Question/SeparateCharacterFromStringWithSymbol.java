package cinntra.InfoTech.Question;

public class SeparateCharacterFromStringWithSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Java";
		
		for(int i =0; i<name.length(); i++) {
			
			  if(i<name.length()-1) {
			System.out.print(name.charAt(i)+",");
		}
			  else {
				  
					System.out.print(name.charAt(i));
			  }

	}
		 
		System.out.println("Second Approach");
		String str = "Java";
	        
	        char ch [] = str.toCharArray();
	        
	        for(int i=0; i<ch.length; i++)
	          
	         if(i==ch.length-1) {
	             
	            System.out.print(ch[i]);
	         }
	        else{
	            
	            System.out.print(ch[i] + ",");
	        }
	    }
	}


