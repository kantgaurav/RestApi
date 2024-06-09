package cloudTech_InterviewProg;

import java.util.Arrays;

public class FindTheSumOfEvenNum_Java8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2, 4,6,1,3,8,10,5,7,9};
		 
		int sum =Arrays.stream(arr).filter(n->n%2==0).sum();
		
		System.out.println(sum);

}
}
