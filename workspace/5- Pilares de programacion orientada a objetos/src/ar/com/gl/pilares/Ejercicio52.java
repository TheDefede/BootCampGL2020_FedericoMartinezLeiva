package ar.com.gl.pilares;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio52 {

	public static void main(String[] args) {
		
		Cafetera cafetera = new Cafetera();
		Heladera heladera = new Heladera();
		Televisor televisor = new Televisor();
		
		List<Electrodomestico> electrodomesticos = new ArrayList<>();
		
		electrodomesticos.add(cafetera);
		electrodomesticos.add(heladera);
		electrodomesticos.add(televisor);
		
		for (Electrodomestico electrodomestico : electrodomesticos) {
			electrodomestico.encender();
		}

	}

}
