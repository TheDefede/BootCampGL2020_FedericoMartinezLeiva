package ar.com.gl.debugging.entity;

import java.util.ArrayList;

public class Bootcamp {

	public static void main(String[] args) {
		
		final Celula celula = new Celula();
		final Referente referente = new Referente("GL66", "Emmanuel Ortiz");
		final ArrayList<Alumno> alumnos = new ArrayList<>();
		
		alumnos.add(new Alumno(1,"Federico Martinez Leiva"));
		alumnos.add(new Alumno(2, "Ivan Alejandro Molina"));
		alumnos.add(new Alumno(3, "Pablo Daniel Cocinero"));
		alumnos.add(new Alumno(4, "Roberto Suarez"));
		alumnos.add(new Alumno(5, "Roberto Suarez"));
		alumnos.add(new Alumno(6, "Facundo Ibarzabal"));
		alumnos.add(new Alumno(7, "Maribel Martinez"));
		
		celula.setNumero(9);
		celula.setReferente(referente);
		celula.setAlumnos(alumnos);
		
		printCelula(celula);
		
		
		
	}

	private static void printCelula(Celula celula) {
		
		System.out.println("========================================");
		System.out.println("* Celula " + celula.getNumero() + "\n");
		System.out.println("***** Referente: " + celula.getReferente().getNombre() + "\n");
		
		for(Alumno alumno : celula.getAlumnos()){
			System.out.println("***** Alumno: " + alumno.getNombre() + "\n");
		}
		
		System.out.println("----------------------------------------");
	}

}
