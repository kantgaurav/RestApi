package collection.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorExaple {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Integer> com = new Comparator<Integer>() {
			public int compare(Integer i1, Integer i2) {
		if(i1%10>i2%10) {
				return 1;
			}
		else {
			return -1;
		}
		}
		};
		
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(45);
		li.add(33);
		li.add(12);
		li.add(16);
		
		Collections.sort(li, com);
		System.out.println(li);
	}
}

