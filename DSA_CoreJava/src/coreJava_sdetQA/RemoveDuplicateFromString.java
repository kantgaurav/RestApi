package coreJava_sdetQA;

public class RemoveDuplicateFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "programming";
	
		
		char arr [] = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i<arr.length; i++) {
			boolean repated= false;
			for (int j = i+1; j<arr.length; j++) {
				
				if(arr[i]==arr[j]){
				//This condition need to check 
					System.out.println("Repeated char is :"+arr[i]);
					repated= true;
					break;
				}
			}
			 
	 if(repated==false) {
		 
		 System.out.println("The char is NOT repeated");
		 sb.append(arr[i]);
	 }
			
		}
		  System.out.println(sb);
	}

}
