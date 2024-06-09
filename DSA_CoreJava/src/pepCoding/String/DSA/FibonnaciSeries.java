package pepCoding.String.DSA;

public class FibonnaciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printFibonnaciSeries(7);

	}
	
	public static void printFibonnaciSeries(int n) {
		
		int a= 0, b=1;
		
		for(int i =0; i<n ; i++) {
		
		System.out.println(a);
		
		int c= a+b; 
		
		a=b;
		
		b=c;
		
		
		}
		
		
	}

}
