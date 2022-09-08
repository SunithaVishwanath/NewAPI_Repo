package crudOperationswithBDD;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class GetProject {

	@Test
	public void getalltheProjects() {
		
		when()
		.get("http://localhost:8084/projects")
		
		.then().log().all();
			
	}
}
