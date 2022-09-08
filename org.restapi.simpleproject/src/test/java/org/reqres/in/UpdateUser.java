package org.reqres.in;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class UpdateUser {
	
	@Test
	public void updateUSer() {
		
	baseURI="https://reqres.in";

	JSONObject ob=new JSONObject();
	ob.put("name", "morpheus");
	ob.put("job", "zion resident");
	
	//precondition
	given()
	.contentType(ContentType.JSON)
	.body(ob)
	
	//execution
	.when()
	.post("/api/users/2")
	
	//Validation
	.then()
	.assertThat().statusCode(200)
	.log().all();
}
}
