package rest.com;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*; //like equalTo() - using matchers to validate the response body

import files.Payload;

public class PostAPI {

	public static void main(String[] args) {

		// Post - creating record

		// using log().all() to print the request and response in console
		/*
		 * RestAssured.baseURI= "https://rahulshettyacademy.com";
		 * given().relaxedHTTPSValidation().log().all().queryParam("key",
		 * "qaclick123").header("Content-Type","application/json")
		 * .body(Payload.payloadBody()) .when().post("/maps/api/place/add/json")
		 * .then().log().all().assertThat().statusCode(200).body("scope",
		 * equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)");
		 */

		// getting the response in string format --> extract().response.asString()

		RestAssured.baseURI = "https://rahulshettyacademy.com";

		String response = given().relaxedHTTPSValidation().queryParam("key", "qaclick123").header("Content-Type", "application/json").body(Payload.payloadBody())
				.when().post("/maps/api/place/add/json")
				.then().assertThat().statusCode(200).body("scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)").extract().response().asString();

		System.out.print(response);
		JsonPath js = new JsonPath(response);      //for parsing json
		String place_id = js.getString("place_id");
		System.out.println(place_id);
		
		
		//Update place - update the place previously created		
		String newAddress = "70 Summer walk, USA";
		given().relaxedHTTPSValidation().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+place_id+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "")
		.when().put("/maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg",equalTo("Address successfully updated"));
		
		
		//Get - retreive the place updated earlier - getting response and add assertion on it		
		given().relaxedHTTPSValidation().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).body("address", equalTo(newAddress));
		
		//or Get - get the response, parse it using jsonpath
		String getResponse = given().relaxedHTTPSValidation().log().all().queryParam("key", "qaclick123").queryParam("place_id", place_id)
		.when().get("/maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).body("address", equalTo(newAddress)).extract().asString();
		
		JsonPath js2 = new JsonPath(getResponse);
		System.out.println(js2.getString("address"));
		

	}

}
