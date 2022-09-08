package pojoClass;

import java.util.HashMap;

import org.pojo.generic.JavaApiUtility;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class PostProjectUsingHashMap {

	@Test
	public void usingMapp() {
		JavaApiUtility jlib=new JavaApiUtility();
		
		
		baseURI="http://localhost";
		port=8084;
		
		HashMap hp=new HashMap();
		hp.put("createdBy", "sunithavishu");
		hp.put("projectName", "Tyyyyy"+jlib.rand());
		hp.put("status", "created");
		hp.put("teamSize", 10);
		
		given()
		.body(hp).contentType(ContentType.JSON)
		
		.when()
		//.post("http://localhost:8084/addProject")//
		.post("/addProject")
		
		.then()
		.assertThat().statusCode(201)
		.log().all();
	}

	}

