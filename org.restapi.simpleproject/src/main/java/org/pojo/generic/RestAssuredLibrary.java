package org.pojo.generic;

import io.restassured.response.Response;
/**
 * 
 * @author sunit
 *
 */

public class RestAssuredLibrary {
	
	/*
	 * this method will give the json data through json path from response body
	 */

	public String getJsonData(Response response, String path)
	{
		String jsonData=response.jsonPath().get(path);
		return jsonData;
	}

}
