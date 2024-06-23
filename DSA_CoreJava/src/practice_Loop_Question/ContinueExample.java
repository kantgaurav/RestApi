package practice_Loop_Question;



public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using while 
		
		
		int x =0;
		
		while (x<10) {
			System.out.println("Inside While Loop");
			x+=1;
			if(x==3 ||x==7) {
				
			continue;
			}
			
			System.out.println(x);
		
			
		}

		/*
		 * for (int i = 1; i <= 10; i++) {
		 * 
		 * if (i == 3 || i == 7) { /// System.out.println(i); continue; }
		 * 
		 * System.out.println(i);
		 * 
		 * }
		 */
	}

}
