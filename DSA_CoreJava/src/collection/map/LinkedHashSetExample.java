package collection.map;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> linkedhs= new LinkedHashSet<>();
		
	    linkedhs.add("fandoo");
	    linkedhs.add("prashant");
	    linkedhs.add("Mumbai");
		
   System.out.println(linkedhs);
   
   Iterator it= linkedhs.iterator();
   
   
  while(it.hasNext()) {
	  
	  System.out.println(it.next());
   
         
	}  
	
}
	


}
