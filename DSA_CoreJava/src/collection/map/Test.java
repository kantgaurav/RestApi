package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test {
	
  public static void main(String args[]) {
	 Map<String, Integer> hmap = new HashMap<String, Integer>();
	    hmap.put("ST", 56);
	    hmap.put("VK", 96);
	    hmap.put("HP", 16);
	    hmap.put("SS", 76);
	   // System.out.println(hmap);
	    
	    ////List<>//

	    for( Entry<String, Integer> x :hmap.entrySet()){

	          System.out.println(x);
	    }

  }
}
