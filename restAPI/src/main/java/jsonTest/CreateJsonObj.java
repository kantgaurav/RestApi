package jsonTest;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CreateJsonObj {
	
	public static void main(String[] args)  {
		
		try {
		Student s1 = new   Student("Thomas", 12, 33);
		
		ObjectMapper mapper = new ObjectMapper();

		mapper.writeValue(new File("target/student2.json"), s1);
		
		
		
	}
		catch(final Exception e) {
			
			
		}
		}

}
