package pepCoding.String.DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Find_nthMinValFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {3,75,55,6,9,0};
		int n=3;
		
		List<Integer> li1= new ArrayList<Integer>();
		
		for(int i :arr) {
			
			li1.add(i);
		}
		//Sort the Arrays
		Collections.sort(li1);
		
		System.out.println(li1.get(n-1));
	}
	



}
