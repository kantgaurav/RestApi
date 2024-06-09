package com.practice.com.demo_proj2;

import java.util.HashMap;
import java.util.Map;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=  new Employee(1);
		Employee e2=  new Employee(1);
		
		Map<Employee, String> mEmp= new HashMap<Employee, String>();
		
		mEmp.put(e1, "Jamvant");
		mEmp.put(e2, "Jamvant");
		
		System.out.println(mEmp.size());
		
	}
}
