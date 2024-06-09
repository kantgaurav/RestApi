package coreJava_sdetQA;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArray_Colletions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Integer  [] array = {3,4,5, 9, 99, 100};

	      //Method 1
	      List<Integer> list = Arrays.asList(array);          
	      System.out.println(list);
	      
	      Collections.reverse(list);
	      
	      System.out.println(list);
	      
	      

	}

}
