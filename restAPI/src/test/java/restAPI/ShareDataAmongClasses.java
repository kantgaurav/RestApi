package restAPI;

import org.testng.annotations.Test;

import org.testng.ITestContext;

import io.restassured.*;

import io.restassured.http.ContentType;

public class ShareDataAmongClasses {

	// * https://www.youtube.com/watch?v=g1f6epAfoIY
	// https://restful-booker.herokuapp.com/apidoc/index.html

	String baseUrl = "https://restful-booker.herokuapp.com/";
	String basePath = "booking";

	@Test
	public void createBooking(ITestContext context) {
		
		
		RestAssured
		.given()
		.log()
		.all()
		.baseUri(baseUrl)
		.basePath(basePath)
		.body( " ")
		.contentType(ContentType.JSON)
		.post()
		.then()
		.log()
		.all()
		.statusCode(200)
		.extract()
		.jsonPath()
		.getInt("bookingId");
		
		
				
				
	}

}
