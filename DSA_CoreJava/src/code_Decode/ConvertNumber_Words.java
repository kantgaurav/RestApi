package code_Decode;


import java.util.Scanner;
import java.util.Set;
import java.util.Map;

import java.util.HashMap;
import java.util.Iterator;

public class ConvertNumber_Words {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		
		//Enter Number and Put the HashMap key // 
		
		Map<Integer, String>  num_Converter = new HashMap();
		
		
		num_Converter.put(1, "ONE");
		
		num_Converter.put(2, "Two");
		num_Converter.put(3, "Three");
		num_Converter.put(4, "Four");
		
		Set<Integer> setItr = num_Converter.keySet();
		
		Iterator<Integer> itr = setItr.iterator();
		
		
		
		while(itr.hasNext()){
			
			//int =itr.next();
			System.out.println(itr.next());
			
			  System.out.println(""+num_Converter.get(itr.next()));
			
		}
		
		
		
		
		
		

	}

}
