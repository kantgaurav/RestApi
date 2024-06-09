package naveenAutomationLab;

public class ConstructorP {
	
	String name;
	
	int age; 
	
public ConstructorP(String name) {
	
	this.name= name;

}

public static void main(String[] args) {
	
	ConstructorP obj = new ConstructorP("Tom");

	
	System.out.println(obj.name);

	System.out.println(obj.age);
	
}

	
}
