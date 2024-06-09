package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortMapByKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer>playerScore= new HashMap<String, Integer>();
		
		playerScore.put("Rohit", 98);
		
		playerScore.put("Sachin", 58);
		playerScore.put("Axar", 28);
		playerScore.put("Sehwag", 48);
		
		
		System.out.println(playerScore);
		
		//TreeeMap 
		
		Map<String, Integer>score= new TreeMap<String, Integer>(playerScore);
		
		System.out.println(score);

	}

}
