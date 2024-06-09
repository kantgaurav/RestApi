package cloudTech_InterviewProg;

public class ArmSttrongNumber {

	public static void main(String[] args) {

		
		int num = 1535; 
		

		
		///calculate Arm Stron number 
		
		boolean res= calculateArmStrongNum(num);
		System.out.println(res);
		
		
		
		
		

	}
	
	//Function to calculate order of the number 
	
	public  static  int  findTotalDigitInNumber(int m) {
		
	    int count =0; 
	    
	    while(m!=0) {
	    	count++; //1 2  3
	    	m = m/10; // 15  .. 1.. 0
	    	
	    }
		
		
		
		return count;
	}
    public   static boolean calculateArmStrongNum(int n) {
    	
    	//boolean val = false;
    	   int c=findTotalDigitInNumber(n);
    	   
    	   
    	   System.out.println("Total Digit are : "+c);
    	   
    	       int temp = n; 
    	       
    	       int x=0, sum =0;
    	       
    	         while (temp!=0) {
    	        	 
    	        	 System.out.println("Inside While Loop");
    	        	 x= temp%10;
    	        	 temp= temp/10;
    	        	 System.out.println("Value of x is:"+x);
    	        	 sum = (int) (sum+Math.pow(x, c));
    	        	 
    	        	 
    	        	 
    	        	 
    	         }
    	         
    	         System.out.println("Total Sum is " +sum);
    	         return (sum==n);
    	          
    }
}
