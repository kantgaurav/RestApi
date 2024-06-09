package com.practice.com.demo_proj2;

import java.util.Objects;

public class Employee {
	
	 
	private int id;
	 private int age; 
	 String name;
	 private String gender; 
	 private String department;
		
	 private int  yearOfJoining; 
	
	 private double salary;
	
	  public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(int yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", gender=" + gender + ", department=" + department
				+ ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
	}



	public Employee(int id2, String name2, int age2, String gender2, String department2, int yearOfJoining2,
			double salary2) {
		
		this.id = id2;
		this.name= name2;
		this.age = age2;
		this.gender = gender2;
		this.department = department2;
		this.yearOfJoining = yearOfJoining2;
		this.salary = salary2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}

	public Employee(int i) {
		// TODO Auto-generated constructor stub
		
		this.id= i;
	}

	

}
