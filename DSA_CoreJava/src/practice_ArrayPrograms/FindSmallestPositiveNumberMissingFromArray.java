package practice_ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSmallestPositiveNumberMissingFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {-1, -3, 3, 2, 8 ,6};
		
List<Integer>resultLi=findSmallestPostiveMissingNum(arr);

System.out.println(resultLi.get(0));

	}
	
	
	public static List<Integer> findSmallestPostiveMissingNum(int arr[]) {
	
	List<Integer> li = new ArrayList<Integer>();
		Arrays.sort(arr);
		int j=0;
		for(int i=0; i<arr.length-1;i++) {
			
			for( j =arr[i]+1; j<arr[i+1]; j++) {
				
				     System.out.println("Missing number is "+j);
				     
				     if(j>0) {
				    	   
                 li.add(j);
				     }
				   
		}
	
	}
		return li;

	}
}
