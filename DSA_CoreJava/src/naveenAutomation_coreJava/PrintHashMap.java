package naveenAutomation_coreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;

public class PrintHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String , Integer> map = new HashMap<String, Integer>();
		
		map.put("Google", 25000);
		map.put("NETFLIX",3500);
		map.put("Yahoo", 300);
		
		System.out.println(map.size());
		
		//Using Java 8 
		
		map.forEach((k,v)->System.out.println("KEY is :" +k+"value is :"+v));
		
		
		System.out.println("Using Iterator");
		Iterator it = map.entrySet().iterator();
		
     while(it.hasNext()) {
    	   
    	       Map.Entry  pairs =(Entry) it.next();
    	       
    	   System.out.println("Key is :" +pairs.getKey() +"Value is :"+pairs.getValue());
    	   
    	   
     }
     
     //Convert HashMap into ArrayList : For the keySet
     
     List<String>compName= new ArrayList<String>(map.keySet());
     System.out.println();
     for(String name: compName) {
    	 
    	 System.out.println(name);
     }
     
     
    List<Integer> empCount = new ArrayList<Integer>(map.values());
     
    for(Integer i: empCount) {
   	 
   	 System.out.println(i);
    }
    
	}

}
