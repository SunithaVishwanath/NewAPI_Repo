package crudOperationswithBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DeletingProject {
	
	@Test
	public void deleteproj() {
		given()
		.delete("http://localhost:8084/projects/TY_PROJ_815")
		
		.then()
		.assertThat().statusCode(204)
		.log().all();
		
		
	}

}
