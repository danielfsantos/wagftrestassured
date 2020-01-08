package wagftrestassured.wagftrestassured;

import com.jayway.restassured.RestAssured;

import cucumber.api.java.Before;

public class ServiceHooks {

	@Before
	public void SetUp(){
		RestAssured.baseURI = "https://swapi.co/api/";
	}
}
