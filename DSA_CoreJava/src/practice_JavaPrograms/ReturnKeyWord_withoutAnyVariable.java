package practice_JavaPrograms;


//return keyword and breakStatement

//"Return" terminates the entire function, 
//while "break" only exits the loop. Consequently, using "return" inside a loop can lead to the premature termination of the entire program if not handled carefully.
public class ReturnKeyWord_withoutAnyVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sample();

	}

	private static void sample() {
		// TODO Auto-generated method stub
		
		for(int i =0; i<=5; i++) {
			
			
			if(i==3) {
				 //break;
				return;
			}
			
			System.out.println(i);
		}
		
		System.out.println("For loop completed");
		
	}
	
	

}
