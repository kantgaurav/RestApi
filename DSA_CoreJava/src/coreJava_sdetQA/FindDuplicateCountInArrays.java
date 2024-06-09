package coreJava_sdetQA;

public class FindDuplicateCountInArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int count= 0;
		
	char arr[] = {'a','b','c','d', 'a','f', 'g', 'a', 'k', 'l', 'k'};
	
	for(int i =0; i<arr.length; i++) {
		
		if(arr[i]=='k') {
			
			count++;
			
		}
	
		
		
	}
	System.out.println("COUNT OF k is:"+count);

	}

}
