package pojoClass;

import static io.restassured.RestAssured.given;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class AddProjectUsingJsonObject {
	
	
	@Test
	public void addproject() {
		JSONObject ref=new JSONObject();
		ref.put("createdBy", "VihanSunitha");
		ref.put("projectName", "APiTesting9585");
		ref.put("status", "On going");
		ref.put("teamSize", 12);
		
		//precondition
		RequestSpecification fhdjdsf = given()
		.contentType(ContentType.JSON)
		.body(ref);
		
		//execution
		//.when()
		Response dsjf =fhdjdsf .post("http://localhost:8084/addProject");
		
		//Validation
		//System.out.println(dsjf.asPrettyString());
		//dsjf.prettyPrint();
		System.out.println(dsjf.prettyPrint());
		System.out.println(dsjf.asString());
		System.out.println(dsjf.getContentType());
		System.out.println(dsjf.statusCode());
		System.out.println(dsjf.getTime());
		//System.out.println(dsjf.asString());
		
		//dsjf.getContentType();
		//System.out.println(dsjf.getBody());
		//.assertThat().contentType(ContentType.JSON)
	//	System.out.println();
		//.time(Matchers.lessThan(10000L));
		//.log().all();
		
	}

	}

