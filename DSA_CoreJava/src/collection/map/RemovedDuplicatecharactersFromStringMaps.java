package collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemovedDuplicatecharactersFromStringMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String word = "SILLYSPIDER";

		Map<Character, Integer> map1 = new LinkedHashMap<Character, Integer>();

		char chArr[] = word.toCharArray();

		int i = 0;
		while (i != chArr.length) {
			char c = chArr[i];

			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);

			}

			else {
				map1.put(c, 1);
			}
        ++i;
		}
		  String res= "";
		System.out.println(map1);
		//The key does not have Duplicate Value , 
		//hence we can get The String without Duplicate if we concat key//
		  for(Character c : map1.keySet()) {
			  
			     res+=c;
		  }
		System.out.println(res);
	}
}
