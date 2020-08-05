package com.globallogic.bootcamp.patterns;

public class App 
{
    public static void main( String[] args ){
    	
    	Playstation playstation = new Playstation(new Game("Resident evil"));
    	
    	System.out.println(playstation.askMyGame());
    	
    	playstation.setVideogame(new Game("Brawlhalla"));
    	
    	System.out.println(playstation.askMyGame());
    	
    	playstation.setVideogame(null);
    	
    	System.out.println(playstation.askMyGame());
    }
}
