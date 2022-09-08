package org.reqres.in;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;

public class PostProject {

	@Test
	public void postRequest() {
		
		baseURI="https://reqres.in/";
		
		
		JSONObject val=new JSONObject();
		val.put("name","Suji");
		val.put("job","IT");
		
		/*val.put("id","4290");
		val.put("createdAt","2022-09-05T05:26:07.702Z"); */
		
		given()
		.body(val).contentType(ContentType.JSON)
		
		.when()
		.post("/api/users")
		
		.then()
		.assertThat().statusCode(201).log().all();
		
	}
}
