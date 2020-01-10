package wagftrestassured.wagftrestassured.steps;
import java.util.List;
import java.util.Map;

import apiObjects.SwapiApiObject;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;

public class SwapiStep {
	SwapiApiObject swapiObject = new SwapiApiObject();
	
	@Dado("^o link da api$")
	public void accessApi() throws Throwable {
		swapiObject.serializableObjectFilms();
	}

	@Quando("^acessar api devera retornar o filme$")
	public void returnFilm(DataTable dt) throws Throwable {
	  List<Map<String,String>> list = dt.asMaps(String.class, String.class);
	  swapiObject.expectFilm(list);
	}
}
