package org.pojo.generic;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.*;

public class BaseClassAPI 
{
	public DataBaseAPIUtility dLib = new DataBaseAPIUtility();
	public JavaApiUtility jLib = new JavaApiUtility();
	public RestAssuredLibrary rLib= new RestAssuredLibrary();

	@BeforeSuite
	public void bsConfig()
	{
		dLib.connectToDB("projects");
		baseURI ="http://localhost";
		port =8084;
	}

	@AfterSuite
	public void asConfig()
	{
		dLib.closeDB();
		System.out.println("Data base closed");
	}
}