package cinntra.InfoTech.Question;

public class FactorialofNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact = factorialOfNum(7);
		System.out.println(fact);

	}
   
	
	public static int factorialOfNum(int num) {
		
		int fact =0;
		
		   if(num==0|| num==1) {
			   fact =1;
			   return  fact;
		   }
		   else {
			   
			   return factorialOfNum(num-1) *num;
		   }
	}
}
