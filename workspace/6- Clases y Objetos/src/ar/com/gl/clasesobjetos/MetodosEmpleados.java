package ar.com.gl.clasesobjetos;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodosEmpleados {
	
		private static String dni, estadoCivil, hijos, sueldo, horasExtras, id;	//conviene hacer los metodos estaticos o crearlos directamente cuando son necesarios?
		private static String regexDni = "^[1-9]\\d{6}$|^[1-9]\\d{7}$";
		private static String regexConfirmacion = "Sí|sí|Si|si|s|S|Yes|yes|y|1|No|no|n|N|0";
		private static String regexAfirmativo = "Sí|sí|Si|si|s|Yes|yes|y|Y|1";
		private static String regexNumeros= "^[1-9]\\d+$|^[1-9]$";
		private static String regexEmpleados ="^1\\d|^[1-9]$|^20$";
		private static Scanner scanner = new Scanner(System.in);
	
		public static String getRegexEmpleados() {
			return regexEmpleados;
		}

		public static String getRegexNumeros() {
			return regexNumeros;
		}

		public static void agregarListaEmpleados(Empleado[] arrayEmpleados) {	
			
			for (int i = 0; i < arrayEmpleados.length; i++) {
				
				System.out.println("================================\nEmpleado nº " + (i+1));
				
				dni = validarInput("Introduce un Dni sin puntos: ", regexDni);
				
				arrayEmpleados[i] = new Empleado(Integer.parseInt(dni));
				
				System.out.print("Introduce un nombre: ");
				arrayEmpleados[i].setNombre(scanner.next());
				
				estadoCivil = validarInput("¿Estas casado/a? ", regexConfirmacion);
				
				if (estadoCivil.matches(regexAfirmativo)) {
					arrayEmpleados[i].setCasado(true);
				}else {
					arrayEmpleados[i].setCasado(false);
				}
				
				hijos = validarInput("¿Tenes hijos? ", regexConfirmacion);
				
				if (hijos.matches(regexAfirmativo)) {
					hijos = validarInput("¿Cuantos?: ", regexNumeros);
					arrayEmpleados[i].setHijos(Integer.parseInt(hijos));
				}else {
					hijos = "0";
					arrayEmpleados[i].setHijos(Integer.parseInt(hijos));
				}
				
				sueldo = validarInput("Sueldo base: ", regexNumeros);
				
				arrayEmpleados[i].setSueldoBase(Double.parseDouble(sueldo));
				
				if (arrayEmpleados[i].getSueldoBase() > 7750) {
					
					arrayEmpleados[i].setRetenciones(12);
					
				} else if(arrayEmpleados[i].getSueldoBase() > 15000) {
					
					arrayEmpleados[i].setRetenciones(15);
					
				} else if(arrayEmpleados[i].getSueldoBase() > 24800) {
					
					arrayEmpleados[i].setRetenciones(18.50);
					
				} else {
					
					arrayEmpleados[i].setRetenciones(9.5);
				}
				
				
				horasExtras = validarInput("¿Trabajaste horas extras? ", regexConfirmacion);
				
				if (horasExtras.matches(regexAfirmativo)) {
					
					horasExtras = validarInput("¿Cuantas? ", regexNumeros);
					
					arrayEmpleados[i].setHorasExtras(Integer.parseInt(horasExtras));
				} else {
					
					horasExtras ="0";
					
					arrayEmpleados[i].setHorasExtras(Integer.parseInt(horasExtras));
					
				}
				
				
				id = String.valueOf(((int) (Math.random()*99999+1)) + 100000 );
				
				id += "ABC";
				
				arrayEmpleados[i].setID(id);
			}
		}
	
		public static String validarInput(String mensaje, String regex) {
			String input;
			Matcher match;
			Pattern pattern = Pattern.compile(regex);
			
			do {
				System.out.print(mensaje);
				input = scanner.next();
				match = pattern.matcher(input);
				
			} while (!match.matches());
			
			return input;
		}

}
