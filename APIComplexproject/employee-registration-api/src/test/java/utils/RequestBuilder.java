package utils;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestBuilder {
	
	public static RequestSpecification getRequestSpec() {
		
		RequestSpecBuilder request = new RequestSpecBuilder();
		request.setBaseUri("https://restful-booker.herokuapp.com").addHeader("Content-Type", "application/json");
		RequestSpecification requestSpec = request.build();
		return requestSpec;
	}

}
