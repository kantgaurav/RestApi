package hackerrank_nikhilLohia_Solutions;

import java.util.Arrays;

public class MoveAllZeroes_InTheEnd {

	public static void main(String[] args) {
	int arr[] = {0,1,0,3,12};
	
 int xx[] =moveAllZero(arr);
 
 System.out.println(Arrays.toString(xx));
		
		
	}
	
	public static  int []  moveAllZero(int nums[]) {
		
		int insertPost=0;
		
		for(int i=0;i<nums.length; i++) {
			
			//For all Non Zero value 
			
			if(nums[i]!=0) {
				
				nums[insertPost]= nums[i];
				
				insertPost++;
			}
			
		}
		
		System.out.println("Array is Filled at Index:" +insertPost);
		
		while(insertPost<nums.length) {
			
			nums[insertPost]= 0;
			insertPost++;
		}
	return nums;	
	}

}
