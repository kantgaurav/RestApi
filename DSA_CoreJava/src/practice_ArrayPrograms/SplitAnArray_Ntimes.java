package practice_ArrayPrograms;

import java.util.ArrayList;
import java.util.List;

public class SplitAnArray_Ntimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		int[] array = { 8, 3, 6, 2, 9, 5, 1, 7, 4 };
		
		List<Integer> liArr= new ArrayList<Integer>();
		List<Integer> liArr1= new ArrayList<Integer>();
		List<Integer> liArr2= new ArrayList<Integer>();
		int splitLen= array.length/3 ;
		
		System.out.println(splitLen);
		
		if(array.length%3==0) {
			System.out.println("Size of Each Individula Array is Fixed ");
			int count =0;
			int j=0, k=0;
			for(int i=0;i<splitLen; i++) {
				
				liArr.add(array[i]);
				count++;
			}
			System.out.println("First Array is:"+ liArr);
			for( j=count;j<(liArr.size()+splitLen); j++ ) {
				
			   System.out.println("Value of j is :"+j );
			   liArr1.add(array[j]);
				count++;
			}
			System.out.println("2ND Array is:"+ liArr1);
			
			  int lastArrSize = (array.length)-(liArr.size()+liArr1.size());
			  System.out.println(lastArrSize);
			  for(k=count;k<array.length; k++) {
				  
				  System.out.println("Last Array");
				  
				  liArr2.add(array[k]);
			  }
			  
				System.out.println("3rd Array is:"+ liArr2);
		}
	}

}
