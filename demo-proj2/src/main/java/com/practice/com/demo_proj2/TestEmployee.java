package com.practice.com.demo_proj2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestEmployee {
	
	public static void main(String[] args) {
		
	List<Employee> emp=	 getAllEmployee();
	
	System.out.println(emp);
	
	
	
	Map<String, Long> collect = emp.stream().collect(Collectors.groupingBy(Employee ::getGender, Collectors.counting()));
		
	System.out.println(collect);
		
	}
	
	
	public static  List<Employee> getAllEmployee() {
	List<Employee> employeeList= new ArrayList<Employee>();
	
  Employee e1= new Employee(111, "Jiya", 21, "Female", "Sales", 2011, 7862347.88);
  Employee e2= new Employee(222, "jams", 41, "Male", "HR", 2011, 7862347.88);
  Employee e3=new Employee(333, "Jyotii", 21, "Female", "Sales", 2011, 7862347.88);
  Employee e4=new Employee(444, "John", 21, "Male", "Sales", 2011, 7862347.88);
employeeList.add(e1);
employeeList.add(e2);
employeeList.add(e3);
employeeList.add(e4);

return employeeList;
  
  
  
}
}
