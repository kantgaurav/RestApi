package practice_JavaPrograms;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findEvenNumber(890744));

	}
	
	
	public static boolean findEvenNumber(int  m) {
		
		boolean flag = false;
		if(m%2==0) {
			  
			flag = true;
			return flag;
		}
	
		return flag;
	}

}