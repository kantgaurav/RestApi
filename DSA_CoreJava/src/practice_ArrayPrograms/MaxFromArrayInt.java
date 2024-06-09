package practice_ArrayPrograms;

public class MaxFromArrayInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr [] = {15, 62, 182, 1, 183};
		
		
		int maxNum = arr[0];
		
		
	for(int i =0; i<arr.length; i++) {
		
	System.out.println("For The Outer Loop Value  is:" + arr[i]);	
		for(int j =i+1; j<arr.length; j++) {
			System.out.println("For The Inner Loop Value  is:" + arr[j]);	
			if(arr[i]> arr[j]) {
		  		
		 maxNum= arr[i];
			
				
				
			}
			else {
				System.out.println("Inside ELSE: " +arr[i]  + ":j value" +arr[j]) ;
				maxNum= arr[j];
				System.out.println("Max Numer is:" +maxNum);
			}
			
			
		}
	}
	System.out.println("Max Num : "+maxNum);
		
		

	}

}
