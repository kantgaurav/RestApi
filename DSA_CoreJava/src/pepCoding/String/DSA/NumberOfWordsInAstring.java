package pepCoding.String.DSA;

public class NumberOfWordsInAstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "the interview is scheduled for today";
		
   int count= findNumOfWordsFromGivenString(s);
   
   System.out.println(count);
	}
	
	public  static int findNumOfWordsFromGivenString(String str) {
		
		
		int numOfWords= 0;
		
		
		String [] arr = str.split(" ");
		
		numOfWords= arr.length;
		return numOfWords;
	}

}
