package practice_Loop_Question;

public class PyramidTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*1 ,2 , 3, 4
	 *  5 6  7
	 *  8 9 
	 *  10
	 * 
	 */
	 
		
		int k=1;
		int j =1;
		for(int i =0; i<4; i++) {
			
			
			System.out.println("Iteration Number :" +i);
			
			
			
			for(j =1; j<=4-i; j++) {
				
				///System.out.print("Inner Loop");
				
			
				
				System.out.print(k);
				System.out.print("\t");
				
				
				k++;
			}
		
			System.out.println();
			
		}

	}

}
