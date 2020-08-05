package com.globallogic.bootcamp.patterns;

public class Playstation {
	
	Game videogame;
	
	public Playstation(Game videogame) {
		this.videogame = videogame;
	}

	public void setVideogame(Game videogame) {
		this.videogame = videogame;
	}
	
	
	
	public Game getVideogame() {
		return this.videogame;
	}

	public String askMyGame() {
		if (this.getVideogame() == null) {
			return "Estoy vacio";
		}
		return "El videojuego que estoy corriendo es : " + this.getVideogame().getTitle() ;
	}

}
