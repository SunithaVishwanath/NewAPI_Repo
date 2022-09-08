package pojoClass;

import java.io.File;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostProjectusingFileName {

	@Test
	public void usingDataDriven() {
		baseURI="http://localhost";
		port=8084;
		
		//Calling the data file 
		File file=new File("./src/test/resources/Filedata.json");
		
		given()
		.body(file)
		.contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat().statusCode(201).time(Matchers.lessThan(2000L))
		.contentType(ContentType.JSON)
		.log().all();
		
	}
}
