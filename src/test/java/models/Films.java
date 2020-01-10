package models;

import javax.xml.bind.annotation.XmlRootElement;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Films {
		private String title;
		private String director;
			
		public Films(String title,String director){
			this.title = title;
			this.director = director;
		}
		
		public Films(){}
		
		
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		
		public String getTitle() {
			return title;
		}
		
}
