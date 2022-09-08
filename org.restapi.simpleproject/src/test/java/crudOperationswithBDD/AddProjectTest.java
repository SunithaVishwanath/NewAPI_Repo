package crudOperationswithBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class AddProjectTest {
	@Test
	public void createProject() {
		JSONObject ref=new JSONObject();
		ref.put("createdBy", "Vihan");
		ref.put("projectName", "APiTesting1");
		ref.put("status", "created");
		ref.put("teamSize", 10);
		
		//precondition
		given()
		.contentType(ContentType.JSON)
		.body(ref)
		
		//execution
		.when()
		.post("http://localhost:8084/addProject")
		
		//Validation
		.then()
		.assertThat().contentType(ContentType.JSON)
		.statusCode(201)
		.log().all();
		
	}

}
