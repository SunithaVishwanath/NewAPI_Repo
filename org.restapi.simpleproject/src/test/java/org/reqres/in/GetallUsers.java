package org.reqres.in;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetallUsers {

	@Test
	public void singleUSer() {
		
		baseURI="https://reqres.in/";
		
		RestAssured.when()
		.get("/api/users?page=2")
		
		.then()
		.assertThat().log().all();
	}
	
}
