package tests;

import pojo.Booking;
import pojo.BookingDates;
import utils.RequestBuilder;
import utils.ResponseBuilder;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.File;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class BookingTest {
	
	int bookingid;
	
	@Test(priority=1)
	public void createBooking() {
		
		BookingDates dates = new BookingDates();
		dates.setCheckin("2024-01-01");
		dates.setCheckout("2024-01-10");
		
		Booking booking = new Booking();
		booking.setFirstname("John");
		booking.setLastname("Doe");
		booking.setTotalprice(1000);
		booking.setDepositpaid(true);
		booking.setBookingdates(dates);
		booking.setAdditionalneeds("Breakfast");
		
		String response = given().relaxedHTTPSValidation().log().all()
			.baseUri("https://restful-booker.herokuapp.com")
			.header("Content-Type","application/json").cookie("token",AuthTest.createToken())
			.body(booking)                                //Serialization - converting Java object to JSON
	.when()
		.post("/booking")
	.then()
		.log().all().assertThat().statusCode(200).body("booking.firstname", equalTo("John")).extract().asString();
		JsonPath js = new JsonPath(response);						//Parse Json reponse body using JsonPath class
		bookingid = js.getInt("bookingid");
		System.out.println("*****"+bookingid+"***********");
	}
	
	@Test(priority=2)
	public void getBooking() {
		
		Booking response = given()
		.relaxedHTTPSValidation().log().all()
		.baseUri("https://restful-booker.herokuapp.com")
		.header("Content-Type","application/json")
	.when()
		.get("/booking/"+bookingid)
	.then().log().all()
		.statusCode(200).extract().as(Booking.class);		//De-serialisation - converting JSON to Java
		
		System.out.println(response.getFirstname() + response.getLastname());
		
	}
	
	@Test(priority=3)
	public void updateBooking() {
		Booking booking = new Booking();
		booking.setFirstname("Brindha");
		
		Booking updatedBooking = given().relaxedHTTPSValidation()
			.spec(RequestBuilder.getRequestSpec()).cookie("token", AuthTest.createToken()).body(booking)
		.when()
			.patch("/booking/"+bookingid)
		.then().log().all()
			.spec(ResponseBuilder.getResponseSpec()).extract().as(Booking.class);
		Assert.assertEquals(updatedBooking.getFirstname(),"Brindha");
	}
	
	@Test(priority=4)
	public void fileUploadTest() {
		
		File file = new File("C:\\Users\\brindv\\eclipse-workspace\\employee-registration-api\\ProjectStructure\\projectStructure.docx");
		given()
			.multiPart("file",file)
		.when().post("https://httpbin.org/post")
		.then().log().all()
		.assertThat()
			.statusCode(200);
			
	}

}
