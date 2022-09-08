package crudOperationwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class DeleteProject {
	
	@Test
	public void delete() {
		Response resp = RestAssured.delete("http://localhost:8084/projects/TY_PROJ_816");
		ValidatableResponse validateRes=resp.then();
		validateRes.assertThat().statusCode(204);
		validateRes.log().all();
	}

}
