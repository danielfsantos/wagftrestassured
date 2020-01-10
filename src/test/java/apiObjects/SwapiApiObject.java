package apiObjects;

import static com.jayway.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import models.Films;

import com.jayway.restassured.path.json.JsonPath;

public class SwapiApiObject {
	private Films filme = new Films();
	
	public void serializableObjectFilms() {
		JsonPath json = given().header("accept", "application/json")
				.get("films/1/").andReturn().jsonPath();
		 filme = json.getObject(".", Films.class);
	}
	
	
	public void expectFilm(List<Map<String,String>> list){
		Films filme2 = new Films(list.get(0).get("Titulo"),list.get(0).get("Diretor"));
		assertEquals(filme2, filme);
	}
	
	
}
