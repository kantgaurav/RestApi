package practice_Loop_Question;

public class Print_MinFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a [][] = {{99, 3,4}, {3, 3, 7}, {5,8,9}, {4,-11, 11} };
		
		
		
		System.out.println("Row Count"+ a.length);
		
		System.out.println("Column Count"+ a[1].length);
		
		int min =a[0][0];
		
		for (int i = 0; i<a.length; i++) {
			
			for(int j =0; j<a[0].length;j++ ) {
				
				System.out.print(a[i][j]);
				
				System.out.print("\t");
				
				if(a[i][j]<min) {
					
					System.out.println("Min Value replaced by" +a[i][j]);
					min = a[i][j];
				}
				
				
				
			}
			
			System.out.println();
		}
		
		System.out.println("Min Value is :"+ min);

	}

}
