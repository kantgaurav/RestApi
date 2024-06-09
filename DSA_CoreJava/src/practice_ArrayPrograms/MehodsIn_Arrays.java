package practice_ArrayPrograms;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MehodsIn_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
	     //Array into arrayList// 
		//asList : Returns a fixed-size list backed by the specified array. (
	     List<String> stooges = Arrays.asList("Larry", "Moe", "Curly");
	     
	     System.out.println(stooges);
	     
	     
	     System.out.println(stooges.toString());
	     
	  
	     stooges.set(2, "Brown");
	     
	    // stooges.add("John");// throw an Error, we cannot add , remove from Fixed size ArrayList

	    // System.out.println(stooges);
	     
	     // Declared  iNT Arrays 
	     
	     List <int []> fixedList2= Arrays.asList(new int[2]);
	   

	   
	      
	     
	     //List<Integer> fixedList1= Arrays.asList(new Integer[3]);
	     //System.out.println(fixedList1.toArray());
	     
	      
	}

}
