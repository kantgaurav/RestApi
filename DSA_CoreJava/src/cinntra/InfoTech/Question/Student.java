package cinntra.InfoTech.Question;

class Student{  
	  
	 /* Student attributes */
	 String name;  
	 int age;
		long mobileNo;
		 int level;
	 @Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", mobileNo=" + mobileNo + ", level=" + level + "]";
	}


	 
	 //default constructor
	 public Student(){
	   
	 }
	 
	 //parametrized constructor
	 public Student(String name, int age, long mobileNo, int level){
	  /*
	   * this.variable_name always refer to class level properties
	   */
	   //set object properties from the arguments/parameters
	   this.name = name;
	   this.age = age;
	   this.mobileNo = mobileNo;
	   this.level = level;
	 }
}
