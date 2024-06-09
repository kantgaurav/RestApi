package hackerrank_nikhilLohia_Solutions;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Student> list= new ArrayList<Student>();
		
		list.add(new Student("Rita", 3, 23 ));
		list.add(new Student("Meena", 4, 33 ));
		list.add(new Student("Disha", 5, 33 ));
		
  Map<Integer, String>stMap= new HashMap<Integer, String>();
		
     for (Student st : list) {
    	 
    	    stMap.put(st.getStudentId(), st.getStudentName());
    	 
     }
		
		  System.out.println(stMap);


	}

}
