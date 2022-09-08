package crudOperationswithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class UpdateOneProject {

	@Test
	public void fullyUpdate() {
	
		JSONObject js=new JSONObject();
		js.put("createdBy", "SunithaVishwanath");
		js.put("projectName", "TestYantra");
		js.put("status","On going");
		js.put("teamSize", 10);
		
		given()
		.contentType(ContentType.JSON)
		.body(js)
		
		.when()
		.put("http://localhost:8084/projects/TY_PROJ_814")
		
		.then()
		.log().all();
		
	}
	
}
