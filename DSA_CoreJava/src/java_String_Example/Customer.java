package java_String_Example;

public class Customer {
	
	private String name;
	private String memberShipType;
	public Customer(String name, String memberShipType) {
		super();
		this.name = name;
		this.memberShipType = memberShipType;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", memberShipType=" + memberShipType + "]";
	}
	
	
	
	

}
