package ar.com.gl.clasesobjetos;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmpleadosMain {

	public static void main(String[] args) {	
		
		String Cantidadempleados;
		
		Cantidadempleados = MetodosEmpleados.validarInput("Introduce la cantidad de empleados entre 1 y 20: ", MetodosEmpleados.getRegexEmpleados());
		
		Empleado[] arrayEmpleados = new Empleado[Integer.parseInt(Cantidadempleados)];
		
		MetodosEmpleados.agregarListaEmpleados(arrayEmpleados);
		
		System.out.println("=============================");
		Empleado.setValorHoraExtra(Integer.parseInt(MetodosEmpleados.validarInput("Ingrese valor hora extra :", MetodosEmpleados.getRegexNumeros())));
		System.out.println("=============================");
		
		List<Empleado> listaEmpleadosSueldo = Arrays.asList(arrayEmpleados);
		List<Empleado> listaEmpleadosHorasExtra = Arrays.asList(arrayEmpleados);
		
		Collections.sort(listaEmpleadosSueldo, Empleado.getSueldoBruto());
		Collections.sort(listaEmpleadosHorasExtra, Empleado.getHoraExtra());
		
		System.out.println("Empleado con mayor salario\n");
		System.out.println(listaEmpleadosSueldo.get(listaEmpleadosSueldo.size()-1));
		
		System.out.println("=============================\n"
				+ "Empleado con menor salario\n");
		System.out.println(listaEmpleadosSueldo.get(0));
		
		System.out.println("=============================\n"
				+ "Empleado con mas horas extras\n");		
		System.out.println(listaEmpleadosSueldo.get(listaEmpleadosHorasExtra.size()-1));
		
		System.out.println("=============================\n"
				+ "Empleado con menos horas extras\n");
		System.out.println(listaEmpleadosHorasExtra.get(0));
		
		
		for (Empleado empleado : listaEmpleadosSueldo) {
			
			System.out.println("=============================");
			
			System.out.println(empleado);
			
			System.out.println("=============================");			
			
		}
	}
}
