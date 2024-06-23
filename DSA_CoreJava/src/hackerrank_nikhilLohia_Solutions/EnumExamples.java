package hackerrank_nikhilLohia_Solutions;

public class EnumExamples{
	
	//https://medium.com/nerd-for-tech/enums-in-java-f70b155b443e
	enum animals {
		
		
		DOG, CAT, RABBIT;
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(animals.CAT);
		
		//print All Values from Enum 
		System.out.println("'Iterarate Enum VALUE");
		  for(animals a: animals.values()) {
			  
			 
			  System.out.println(a);
			  
			  
		  }
		
	}
	
}