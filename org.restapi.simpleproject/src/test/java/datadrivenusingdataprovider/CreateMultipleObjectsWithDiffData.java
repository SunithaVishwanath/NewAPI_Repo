package datadrivenusingdataprovider;

import org.api.pojoclass.PojoclassForPost;
import org.pojo.generic.ExcelUtility;
import org.pojo.generic.JavaApiUtility;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class CreateMultipleObjectsWithDiffData {
	
	ExcelUtility elib=new ExcelUtility();
	
	@Test(dataProvider = "getdata")
	public void createProject(String createdBy,String projectName,String status,String teamSize) {
		
		JavaApiUtility jlib=new JavaApiUtility();
		
		PojoclassForPost pj=new PojoclassForPost(createdBy, projectName+jlib.rand(), status, teamSize);
		baseURI="http://localhost";
		port=8084;
		
		given()
		.body(pj).contentType(ContentType.JSON)
		
		.when()
		.post("/addProject")
		
		.then()
		.assertThat().statusCode(201)
		.contentType(ContentType.JSON).log().all();
		
		
	}
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data1=new Object[2][4];
		
		/*
		data1[0][0]="Su";
		data1[0][1]="Pojoproj";
		data1[0][2]="Created";
		data1[0][3]=13;
		
		data1[1][0]="sou";
		data1[1][1]="pojo";
		data1[1][2]="On going";
		data1[1][3]=14;
		*/
		
		data1[0][0]= elib.readDataFromExcel("ABCD",2,0);
		data1[0][1]= elib.readDataFromExcel("ABCD",2,1);
		data1[0][2]= elib.readDataFromExcel("ABCD",2,2);
		data1[0][3]= elib.readDataFromExcel("ABCD",2,3);
		
		data1[1][0]= elib.readDataFromExcel("ABCD",3,0);
		data1[1][1]= elib.readDataFromExcel("ABCD",3,1);
		data1[1][2]= elib.readDataFromExcel("ABCD",3,2);
		data1[1][3]= elib.readDataFromExcel("ABCD",3,3);
		
		return data1;
		
		
		
		
		
	}
}
