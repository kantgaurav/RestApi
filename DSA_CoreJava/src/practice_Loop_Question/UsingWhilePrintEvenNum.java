package practice_Loop_Question;

public class UsingWhilePrintEvenNum {

	
	//print Even njumber in between 1 To 50 	And give count
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num =1; 
		int count=0;
		while(num<50) {
			   if(num%2==0) {
				   System.out.println("Even Number is :"+num);
				   count+=1;
			   }
			   num+=1;
		}
		
		System.out.println("Total Count of Even number is:"+count);

	}

}
