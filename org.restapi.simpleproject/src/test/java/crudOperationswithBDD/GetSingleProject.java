package crudOperationswithBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class GetSingleProject {
	
	@Test
	public void getoneProject() {
		
		given()
		.get("http://localhost:8084/projects/TY_PROJ_814")
		
		.then()
		.log().all();
		
		
	}

}
