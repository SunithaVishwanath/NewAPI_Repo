package StaticAndDynamic.Validation;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import junit.framework.Assert;

import static io.restassured.RestAssured.*;

public class StaticValidation {

	@Test
	public void staticResponse() {
		
		String expId="TY_PROJ_1004";
		
		baseURI="http://localhost";
		port=8084;
		
		Response resp = when().get("/projects");
		
		String actId = resp.jsonPath().get("[2].projectId");
		
		Assert.assertEquals(expId, actId);
		System.out.println("Data is Verified");
	
		resp.then().log().all();
		
	}
}
