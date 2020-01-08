package wagftrestassured.wagftrestassured.steps;
import static com.jayway.restassured.RestAssured.given;


import models.Films;

import com.jayway.restassured.path.json.JsonPath;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class SwapiStep {

	@Dado("^o link da api swapi co$")
	public void linkApi() throws Throwable {
	 JsonPath json =  given().header("accept","application/json").get("films/1/").andReturn().jsonPath();
 	Films filme = json.getObject("", Films.class);
	 System.out.println(filme.getDirector());
	}

	@Quando("^acessar a api$")
	public void accessApi() throws Throwable {
	   
	}

	@Então("^devera retornar os personagens do star wars$")
	public void devera_retornar_os_personagens_do_star_wars() throws Throwable {
	   
	}

	
}
