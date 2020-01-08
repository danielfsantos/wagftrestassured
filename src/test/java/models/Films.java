package models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Films {
		private String title;
		private String director;
		private String edited;
		
		public Films(){}
		
		public Films(String title,String director,String edited){
			this.title = title;
			this.director = director;
			this.edited = edited;
		}
		
		public String getTittle() {
			return title;
		}
		public void setTittle(String tittle) {
			this.title = tittle;
		}
		public String getDirector() {
			return director;
		}
		public void setDirector(String director) {
			this.director = director;
		}
		
}
