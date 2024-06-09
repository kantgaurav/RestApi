package cinntra.InfoTech.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortDate_UsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
List<String> datesList = new ArrayList<>();
datesList.add("2021-03-25");
datesList.add("2002-02-26");
datesList.add("2024-05-01");
datesList.add("2020-03-26");
datesList.add("2021-01-05");
datesList.add("2021-01-07");
System.out.println("Before Sorting");

for(String date : datesList) {
	
	System.out.println(date);
}
Collections.sort(datesList, Collections.reverseOrder());
		
System.out.println("After Sorting");

for(int i=0; i<datesList.size(); i++) {
	  System.out.println(datesList.get(i));
}
	}

}
