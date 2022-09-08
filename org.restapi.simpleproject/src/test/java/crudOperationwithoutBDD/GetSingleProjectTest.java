package crudOperationwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class GetSingleProjectTest {

	@Test
	public void getSingleproject() {
		Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_815");
		ValidatableResponse resp=response.then();
		resp.assertThat().statusCode(200);
		resp.log().all();
	}

}
