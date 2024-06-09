package coreJava_sdetQA;

public class staicOverRides {

	public static void main(String[] args) {
		
		Parent p =  new Child();
		
		System.out.println("Class Name of Object:::"+p.getClass());
		
		p.staticMethod();
		
		
		Child c = new Child();
		
		System.out.println(""+c.getClass());
		
		c.staticMethod();
		

		
		
	}
}
