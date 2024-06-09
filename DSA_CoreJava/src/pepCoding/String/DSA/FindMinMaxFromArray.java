package pepCoding.String.DSA;

public class FindMinMaxFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,90,4,1,45,90,56,1};
		
		int [] result = new int[2];
		result =findMinMax(arr);
		
		System.out.println("Min is :"+ result[0]);
		System.out.println("Max is: "+ result[1]);
	}
	
	
	public static  int[] findMinMax(int [] input) {
		int arr[] = new int[2];
		 int min = input[0], max=input[0];
	
	
		 for(int i=0;i<input.length; i++) {
			 
			   if(  min>input[i]) {
				  min= input[i];
				   
			   }
			   
			   if(max<input[i]) {
				   
				   max = input[i];
			   }
			 
			 
			  
			   
			 
		 }
		 
		 arr[0]= min;
		 arr[1]= max;
		
		System.out.println("Min is"+ arr[0]);
		System.out.println("Max is"+ arr[1]);
		return arr;
	}

}
