package practice_JavaPrograms;

public class Check_ArrayContainsAGivenValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num [] = {7, 8, 9, 90, 11, 22, 33};
		
		int toFind= 11;
		
		boolean flag = false; 
		
		int index =0;
		for(int m : num ) {
		      
			if(m==toFind) {
	      
				flag= true;
				
				System.out.println("Index is :"+ index);
				
				break;
			}
			index++;
		}
		
		if(flag) {
			
			System.out.println("The value is Found");
		}
	}

}
