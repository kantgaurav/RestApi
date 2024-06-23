package apiTest;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class RestApiBasicFunction {
	
	String url = "https://reqres.in/api/users?page=2";
	
	@Test
	public void checkBasicDetails() {
		
		Response response=   RestAssured.get(url);
		
		System.out.println("Status Code"+response.getStatusCode());
		
		System.out.println("response Body:"+response.getBody().asPrettyString());
		
		System.out.println("Response Time:"+ response.getTime());
		
	}

}
