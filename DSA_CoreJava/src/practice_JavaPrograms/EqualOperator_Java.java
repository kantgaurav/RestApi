package practice_JavaPrograms;

public class EqualOperator_Java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Java";
		String s2= "Java";
		
		System.out.println(s1==s2);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		
		
		String s3= new String("Java");
		
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
