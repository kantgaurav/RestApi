package practice_Loop_Question;

import java.util.Arrays;

public class FindMaxFromArray_FindMinInSameColumn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]  = {{3,6,7}, {11, 22, 33}, {1, 2, 34}};
		
		int max = arr[1][1];
		
		int reqColNum=0;
		
		int colval[] = {};
		for(int i =0; i< arr.length; i++) {
			
			System.out.println("Print the Row Number :" +i);
			
			
			for(int j = 0 ; j <arr[0].length; j++) {
				
				
				System.out.print(arr[i][j]);
				
				System.out.print("\t");
				
				if(arr[i][j]> max) {
					
					max = arr[i][j];
					reqColNum = j;
					System.out.println("Column number is " + reqColNum);
					
				
				}
				
				int k=0;
				if(reqColNum==j) {
					
					colval[k]=arr[i][j];
					
					k++;
				}
			
			}
			System.out.println("");
			System.out.print("Completed the row ");
		}
		
		
		
		
		System.out.println("Max Value is :"+max );
		
		System.out.println(Arrays.toString(colval));
		

	}
	
	//now Iterate the 	Column and FIND the min Value 
	
	

	
	
	

}
