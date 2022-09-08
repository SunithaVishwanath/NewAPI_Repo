package pojoClass;

import org.api.pojoclass.PojoclassForPost;
import org.hamcrest.Matchers;
import org.pojo.generic.JavaApiUtility;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

public class PostProjectusingPojoTest{
	
	@Test
	public void addingtheProject() {
		JavaApiUtility jlib=new JavaApiUtility();
		
		PojoclassForPost obj= new PojoclassForPost("Sunith","Testy123"+jlib.rand(),"created","13");
		
		given()
		.contentType(ContentType.JSON).body(obj)
		
		.when()
		.post("http://localhost:8084/addProject")
		
		.then().contentType(ContentType.JSON)
		.statusCode(201)
		.assertThat().time(Matchers.lessThan(2000L),TimeUnit.MILLISECONDS).log().all()
		.log().all();
	}

}
