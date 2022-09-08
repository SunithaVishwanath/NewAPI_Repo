package crudOperationwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PostProjectTest {

	@Test
	public void create() {
		
	//json body created	
	JSONObject jobj=new JSONObject();
	jobj.put("createdBy","Sunitha");
	jobj.put("projectName","APItesting");
	jobj.put("status","created");
	jobj.put("teamsize",5);
	
	//request body and content type
	RequestSpecification rs= RestAssured.given();
	rs.body(jobj);
	rs.contentType(ContentType.JSON);
	
	//Validation
	Response response=rs.post("http://localhost:8084/addProject");
	ValidatableResponse validateRes=response.then();
	validateRes.assertThat().contentType(ContentType.JSON);
	validateRes.assertThat().statusCode(201);
	validateRes.log().all();

}

}
