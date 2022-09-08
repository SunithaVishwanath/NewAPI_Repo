package crudOperationwithoutBDD;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class PutProjectTest {
	
	@Test
	
	public void putProject() {  
	//json simple
	JSONObject jobj1=new JSONObject();
	jobj1.put("createdBy","Geethe");
	jobj1.put("projectName","APItesti");
	jobj1.put("status","On going");
	jobj1.put("teamsize",12);
	/*
	RequestSpecification rs= RestAssured.given().body(jobj1);
	rs.contentType(ContentType.JSON);
	rs.given().body(jobj1.toString());
	
	Response response=rs.put("http://localhost:8084/projects/TY_PROJ_811");
	ValidatableResponse validateRes=response.then().log().all();
	validateRes.assertThat().contentType(ContentType.JSON);*/
		
		
		RequestSpecification req = RestAssured.given();
		req.body(jobj1);
		req.contentType(ContentType.JSON);
		
		Response response = req.put("http://localhost:8084/projects/TY_PROJ_811");
		ValidatableResponse validate = response.then();
		validate.contentType(ContentType.JSON);
		validate.statusCode(200);
}
}
