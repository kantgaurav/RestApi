package collection.map;


/*  Java Techies :    */
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class concurrentHashMap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Map<Integer, String> map = new ConcurrentHashMap<>();
   map.put(1, "A");
   map.put(2, "B");
   System.out.println(map);
   
   Iterator it = map.keySet().iterator();
   
   while(it.hasNext()) {
	   
	   //System.out.println(it.next());
	     Integer i = (Integer) it.next();
	     
	     System.out.println(i);
	     System.out.println(map.get(i));
	  
	   
   }
	}

}
