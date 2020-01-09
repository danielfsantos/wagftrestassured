package apiObjects;

import static com.jayway.restassured.RestAssured.given;
import models.Films;

import com.jayway.restassured.path.json.JsonPath;

public class SwapiApiObject {

	public void serializableObjectFilms(){
		JsonPath json =  given().header("accept","application/json").get("films/1/").andReturn().jsonPath();
	
	 	Films filme = json.getObject(".", Films.class);
		 System.out.println(filme.getDirector());
	}
	
}
