package jsonTest;

public class Student {
	private int studentId;
	private String studentName;
	private int age;
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentAge(int age) {
		
		this.age = age;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + "]";
	}

	public  Student(String stdName, int stdId, int age) {
		
		  this.studentName= stdName;
		  this.studentId = stdId;
		  
		  this.age= age;
	}
	
	

}
