package pojo_Session15CodeStudio;

import java.util.HashMap;
import java.util.Map;


import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class SerilizationTest {
	
	@Test
	public void createJavaClassFromJson() {
		
		String baseUrl= "https://restful-booker.herokuapp.com/";
		String path = "/auth";
		
		Map<String , String> authCred= new HashMap<String, String>();
		
		authCred.put("username", "admin");
		
		authCred.put("password", "password123");
		
		
		Response res=RestAssured.
		                          given()
		.baseUri(baseUrl)
		.basePath(path)
		.contentType(ContentType.JSON)
		.body(authCred)
		.post();
		
		
		System.out.println(res.prettyPrint());
		
		System.out.println(res.statusCode());
		
	}

}
