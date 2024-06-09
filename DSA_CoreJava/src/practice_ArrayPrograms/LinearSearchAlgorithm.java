package practice_ArrayPrograms;

//https://www.geeksforgeeks.org/array-data-structure/?ref=shm
public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {33, 89, 8, 4, 6, 8};
	int result =	linearSearch(arr, arr.length, 5);
	
	if(result>=0) {
		
		System.out.println("Given number is FOUDN at INDEX"+ result);
	}
	else {
		
		System.out.println("Element Not Exist IN array");
	}

	}

	
	public static int  linearSearch(int [] arr, int size, int m) {
		
	  for(int k =0; k<size; k++) {
		  
		  if(arr[k]==m) {
			  
			  return k;
		  }
		  
		
	  }
		
		return -1;
	
	}
}
