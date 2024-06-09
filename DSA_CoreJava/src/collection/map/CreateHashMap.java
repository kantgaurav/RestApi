package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class CreateHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="SHASHIKANT";
		char [] y = name.toCharArray();
		int len= y.length;
		
		//Map<Character, Integer> map1= new HashMap<Character, Integer>();
	Map<Character, Integer> map1= new LinkedHashMap<Character, Integer>();
		//Map<Character, Integer> map1= new TreeMap<Character, Integer>();
    int i=0;
    
    while(i!= len) {
    	char c =y[i];
    	if(map1.containsKey(c)) {
    		System.out.println("Key Exist :"+c);
    		map1.put(c, map1.get(c)+1);
    	}
    	
    	else {
    		map1.put(y[i], 1);
    		
    	}
    	i++;
    }
		
		for( Map.Entry<Character, Integer> entry: map1.entrySet()) {
			
			System.out.println("Key is :"+ entry.getKey() +"Value is :"+ entry.getValue());
			
			
		}
		
		
		//Remove methid 
		
		System.out.println(map1.remove('A'));
		
		System.out.println(map1.entrySet());
		
	  map1.replace('S', 4);

	}

}
