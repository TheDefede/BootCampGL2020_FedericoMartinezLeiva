package ar.com.gl.clasesobjetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmpleadosMain {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String empleados, dni, estadoCivil, hijos, sueldo, horasExtras, id;
		String regexEmpleados ="^1\\d|^[1-9]$|^20$";
		String regexDni = "^[1-9]\\d{6}$|^[1-9]\\d{7}$";
		String regexConfirmacion = "Sí|sí|Si|si|s|Yes|yes|y|1|No|no|n|0";
		String regexAfirmativo = "Sí|sí|Si|si|s|Yes|yes|y|1";
		String regexNumeros= "^[1-9]\\d+$|^[1-9]$";
		
		empleados = validarInput("Introduce la cantidad de empleados entre 1 y 20: ", regexEmpleados, scanner);

		
		Empleado[] arrayEmpleados = new Empleado[Integer.parseInt(empleados)];
		
		for (int i = 0; i < arrayEmpleados.length; i++) {
			
			System.out.println("================================\nEmpleado nº " + (i+1));
			
			dni = validarInput("Introduce un Dni sin puntos: ", regexDni, scanner);
			
			arrayEmpleados[i] = new Empleado(Integer.parseInt(dni));
			
			System.out.print("Introduce un nombre: ");
			arrayEmpleados[i].setNombre(scanner.next());
			
			
			
			estadoCivil = validarInput("¿Estas casado/a? ", regexConfirmacion, scanner);
			
			if (estadoCivil.matches(regexAfirmativo)) {
				arrayEmpleados[i].setCasado(true);
			}else {
				arrayEmpleados[i].setCasado(false);
			}
			
			hijos = validarInput("¿Tenes hijos? ", regexConfirmacion, scanner);
			
			if (hijos.matches(regexAfirmativo)) {
				hijos = validarInput("¿Cuantos?: ", regexNumeros, scanner);
				arrayEmpleados[i].setHijos(Integer.parseInt(hijos));
			}else {
				hijos = "0";
				arrayEmpleados[i].setHijos(Integer.parseInt(hijos));
			}
			
			sueldo = validarInput("Sueldo base: ", regexNumeros, scanner);
			
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
			
			
			horasExtras = validarInput("¿Trabajaste horas extras? ", regexConfirmacion, scanner);
			
			if (horasExtras.matches(regexAfirmativo)) {
				
				horasExtras = validarInput("¿Cuantas? ", regexNumeros, scanner);
				
				arrayEmpleados[i].setHorasExtras(Integer.parseInt(horasExtras));
			}else {
				
				horasExtras ="0";
				
				arrayEmpleados[i].setHorasExtras(Integer.parseInt(horasExtras));
				
			}
			
			
			id = String.valueOf(Math.floor((Math.random()*99999+1)) + 100000 );
			
			id += "ABC";
			
			arrayEmpleados[i].setID(id);
		}
		
		System.out.println("=============================");
		Empleado.setValorHoraExtra(Integer.parseInt(validarInput("Ingrese valor hora extra :", regexNumeros, scanner)));
		System.out.println("=============================");
		
		
		List<Empleado> listaEmpleados = Arrays.asList(arrayEmpleados);
		
		Collections.sort(listaEmpleados);
		System.out.println("=============================\n"
				+ "Empleado con menor salario\n");
		System.out.println(listaEmpleados.get(0));
		System.out.println("=============================\n"
				+ "Empleado con mayor salario");
		System.out.println(listaEmpleados.get(listaEmpleados.size()-1));
		System.out.println("=============================\n");
		
		
		for (Empleado empleado : arrayEmpleados) {
			
			System.out.println("=============================");
			
			System.out.println(empleado);
			
			System.out.println("=============================");			
			
		}
	}

	private static String validarInput(String mensaje, String regex, Scanner scanner) {
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
