package utils;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseBuilder {
	
	public static ResponseSpecification getResponseSpec() {
		
		ResponseSpecBuilder response = new ResponseSpecBuilder();
		response.expectStatusCode(200).expectContentType("text/html");
		ResponseSpecification responseSpec = response.build();
		return responseSpec;
	}

}
