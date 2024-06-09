package jsonTest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSON2JavaObj {

	public static void main(String[] args)  {		
		
		//Person p1= new Person("Chris", "45");
		String obj1 = """
			{
					"name" :"Chris", 
					"age" :"23"
					
			}
		""";
		try {

		ObjectMapper objMapper = new ObjectMapper();
		objMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	 Person p1=objMapper.readValue(obj1, Person.class);
		
      System.out.println(p1);
	}
		
		
catch(JsonMappingException jse) {
	  System.out.println("Mapping error is:"+ jse);
	
}
		catch(JsonProcessingException jpe) {
			
			System.out.println("Processing Erroe is :"+jpe.toString());
		}
}
	
}

class Person {
	String name;
	String age;
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	public Person(String name, String age) {
		this.name = name;
		this.age = age;
	}
}