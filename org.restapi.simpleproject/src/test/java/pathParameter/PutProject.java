package pathParameter;
import static io.restassured.RestAssured.*;

import org.api.pojoclass.PojoclassForPost;
import org.hamcrest.Matchers;
import org.pojo.generic.JavaApiUtility;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutProject {
	@Test
	public void updateProject()
	{
		JavaApiUtility jlib = new JavaApiUtility();
		PojoclassForPost proj = new PojoclassForPost("Sunitha", "Project"+jlib.rand(), "Created", "40");
		
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(proj)
		.contentType(ContentType.JSON)
		.pathParam("pathID","TY_PROJ_1204" )
		.when()
		.put("/projects/{pathID}")
		.then().assertThat().contentType(ContentType.JSON).statusCode(200).time(Matchers.lessThan(2000L)).log().all();
	}

}
