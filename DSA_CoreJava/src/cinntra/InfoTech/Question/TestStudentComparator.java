package cinntra.InfoTech.Question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestStudentComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Student s1=new Student("Bob",37,1987654321,11);
		 Student s2=new Student("Alex",21,1234567891,10);//creating an s1 object of Student  
		 
		  
		  System.out.println(s1);
		  //CREATE a collection object of Student 
		  
		  List<Student> l1 = new ArrayList();
		  l1.add(s1);
		  l1.add(s2);
		  Collections.sort(l1, new NameComparator());
		  System.out.println(l1);

	}
	

}
