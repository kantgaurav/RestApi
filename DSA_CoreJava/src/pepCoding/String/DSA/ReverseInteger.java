package pepCoding.String.DSA;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5678;
		int rev=reverseInt(x);
		
		System.out.println(rev);

	}
	
	
	public static int reverseInt(int i) {
		int rev= 0;
	  while(i!=0) {
		  int digit = i%10;
		  i= i/10;
		rev= (rev*10)+digit;
	}
	return rev;
	}

}
