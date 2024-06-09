package coreJava_sdetQA;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Jai Ganesh");
		
		int search_int =300;
		
		int [] arr= {90, 60, 10, 30, 50};
		
		boolean val = false;
		
		for (int i =0; i<arr.length; i++) {
			
			  if(arr[i]==search_int) {
				  
				  
				System.out.println("Condition Met");
				val= true;
				
				break;
			  }
			  
			  
			
		}
		
	System.out.println(val);

	}

}
