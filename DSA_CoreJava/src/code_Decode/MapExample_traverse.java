package code_Decode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample_traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Math.abs(-10);
		Map<Integer, String> product =  new HashMap<Integer,String>();
		
		product.put(1, "Elect_Music");
		product.put(2, "Elect_WashingMachine");
		product.put(3, "Elect_TV");
		
		///iTERATE using  keySet and For each Loop 
	
		for (Integer key : product.keySet()) {
			
			System.out.println("Key is :"  +key + "value is:" +product.get(key));
		}
		
		//using Set Iterator : 
		
		  Set<Integer>iterator= product.keySet();
		  
		  Iterator<Integer> keySetIterator= iterator.iterator();
		  
		  while(keySetIterator.hasNext()) {
			  
			  Integer key = keySetIterator.next();
			  
			  System.out.println("key is" +key +"value is" + product.get(key));
			  
			//   System.gc();
			  
			  
			   
			  
		  }

	}

}
