package apiTest;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class CoinBaseApi_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//GEThttps://api.coinbase.com/api/v3/brokerage/best_bid_ask
	
		 String baseUrl = "https://api.coinbase.com/api/v3/brokerage/best_bid_ask";
		System.out.println("CoinBase");
		
	Response res=	RestAssured.given().baseUri(baseUrl).contentType(ContentType.JSON).get();

	
	System.out.println(res.prettyPrint());
	System.out.println(res.statusCode());
	}

}
