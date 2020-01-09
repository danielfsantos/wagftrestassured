package models;

import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@XmlRootElement
@JsonIgnoreProperties(ignoreUnknown = true)
public class Films {
		private String title;
		private String director;
		private String edited;
		private String created;
		private String[] vehicles;
		
		public Films(){}
		
		public Films(String title,String director,String edited,String created,String[] vehicles){
			this.title = title;
			this.director = director;
			this.edited = edited;
			this.created = created;
			this.vehicles = vehicles;
		}
	
		public void setTitle(String title) {
			this.title = title;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		
		public String getEdited() {
			return edited;
		}

		public void setEdited(String edited) {
			this.edited = edited;
		}

		public String getTitle() {
			return title;
		}
		
		
		public String getCreated() {
			return created;
		}

		public void setCreated(String created) {
			this.created = created;
		}

		public String[] getVehicles() {
			return vehicles;
		}

		public void setVehicles(String[] vehicles) {
			this.vehicles = vehicles;
		}

		
}
