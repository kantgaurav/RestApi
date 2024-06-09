package practice_Loop_Question;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 A a = new A();
		 
		 System.out.println(a.i);
		 
		 A obj1 = new B(); 
		 
		 System.out.println(obj1.i);
	
		 
		 
		 B obj2 = new B(); 
		 
		 System.out.println(obj2.i);
		 
		 System.out.println(obj2.j);
		 

	}

}


class A{
	
	int i=10;
	int j= -9;
}


class B extends A{
	
	int i =22;
	int k =20730;
}
