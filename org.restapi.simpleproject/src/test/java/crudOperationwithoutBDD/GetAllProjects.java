package crudOperationwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetAllProjects {
	@Test
	public void getproj() {
		
		Response r = RestAssured.get("http://localhost:8084/projects");
		
		//r.then().log().all();
		//System.out.println(r.asPrettyString());
		
		System.out.println(r);
		System.out.println(r.asString());
		System.out.println(r.prettyPrint());
		
		ValidatableResponse response=r.then();
		response.assertThat().statusCode(200);
		response.log().all();
	}
}
