package org.reqres.in;

import static io.restassured.RestAssured.baseURI;

import io.restassured.RestAssured;

public class GetSingleUSer {

	public void getRequest() {
		
		baseURI="https://reqres.in/";
		
		RestAssured.when()
		.get("/api/users/2")
		
		.then()
		.assertThat().log().all();
		
		
	}
}
