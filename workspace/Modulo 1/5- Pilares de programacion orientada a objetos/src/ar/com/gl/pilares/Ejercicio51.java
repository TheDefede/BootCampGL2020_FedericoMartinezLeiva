package ar.com.gl.pilares;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ejercicio51 {

	public static void main(String[] args) {
		
		Electrodomestico electrodomestico = new Electrodomestico();
		Heladera heladera = new Heladera();
		
		Field[] atributosElectrodomestico = electrodomestico.getClass().getFields();
		Method[] metodosElectrodomestico = electrodomestico.getClass().getMethods();
		
		Field[] atributosHeladera = heladera.getClass().getFields();
		Method[] metodosHeladera = heladera.getClass().getMethods();
		
		
		System.out.println("==========================================");
		for (Method metodo : metodosElectrodomestico) {
			
			if (metodo.getName() == "wait") {
				break;
			}
			
			System.out.println("Metodo de electrodomestico: " + metodo.getName() + "()");
		}
		
		System.out.println("==========================================");
		
		for (Method metodo : metodosHeladera) {
			
			if (metodo.getName() == "wait") {
				break;
			}
			
			System.out.println("Metodo de heladera: " + metodo.getName() + "()");
		}
		
		System.out.println("==========================================");
		
		for (Field atributo : atributosElectrodomestico) {
			
			System.out.println("Atributo de electrodomestico: " + atributo.getName());
		}
		
		System.out.println("==========================================");
		
		for (Field atributo : atributosHeladera) {
			
			System.out.println("Atributo de heladera: " + atributo.getName());
		}
		
		System.out.println("==========================================");
	}

}
