package tests;

import pojo.AuthRequest;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class AuthTest {
	
	public static String token;
	
	@Test
	public static String createToken() {
		AuthRequest auth = new AuthRequest();
		auth.setUsername("admin");
		auth.setPassword("password123");
		token = given().relaxedHTTPSValidation()
			.baseUri("https://restful-booker.herokuapp.com")
			.header("Content-Type","application/json")
			.body(auth).log().all()
		.when()
			.post("/auth")
		.then()
		.assertThat().log().all()
			.statusCode(200)
			.extract().path("token");				//parse the Json path "token" using extract().path()
		
		System.out.println("Token:" + token);
		
	return token;
		
	}

}
