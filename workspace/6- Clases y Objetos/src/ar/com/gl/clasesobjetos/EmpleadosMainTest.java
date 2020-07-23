package ar.com.gl.clasesobjetos;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class EmpleadosMainTest {
	
	EmpleadosMain instanciaMain = new EmpleadosMain();
	
	isntanciaMain.

	@Test
	void test() {
		Empleado empleado1 = new Empleado(38168885);
		empleado1.setNombre("Federico Martinez Leiva");
		empleado1.setHijos(5);
		empleado1.setSueldoBase(10000);
		empleado1.setHorasExtras(60);
		empleado1.setCasado(true);
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		
		listaEmpleados.add(empleado1);
		
		assertNotNull(listaEmpleados);
		
		assertEquals(1, listaEmpleados.size());
		
		
	}

}
