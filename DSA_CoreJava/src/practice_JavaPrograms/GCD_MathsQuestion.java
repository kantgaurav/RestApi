package practice_JavaPrograms;

public class GCD_MathsQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1= 14; 
		
		int m2 = 94;
		
		
	int gcd=	findHighestCommonFactor(m1, m2);
	
	System.out.println(gcd);

	}
	
	
	public static int findHighestCommonFactor(int m1, int m2) {
		int gcd =1; 
		
		int min = (m1>m2)?m2:m1;
		
		System.out.println("Minimum  Value :"+min);
		
		for(int i =1; i<=min; i++) {
			
			if(m1%i==0 && m2%i==0) {
				
				
				gcd = i;
			}
			
		}
		System.out.println("Higehest common factor is :"+ gcd);
		return gcd;
	}

}
