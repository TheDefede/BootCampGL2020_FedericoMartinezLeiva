package coverage.loteria;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coverage.loteria.model.CartonGenerator;

public class AppTest {
	
	Loteria loteria;
	CartonGenerator cartonGenerator;
	
	@BeforeEach
	void beforeEach() {
		cartonGenerator = new CartonGenerator();
	}
	
	@Test
	void getMethodsTest() {
		float pozo = 20000f;
		int boletos= 200;
		
		loteria = new Loteria(pozo,boletos, cartonGenerator);
		
		assertEquals(pozo + boletos, loteria.getPozo() + loteria.getBoletos());
		
	}
	
	@Test
	void getGanadoresTest() {
		float pozo = 20000f;
		int boletos= 200;
		
		loteria = new Loteria(pozo,boletos, cartonGenerator);
		
		loteria.jugada();	
		
		assertNotNull(loteria.getGanadores());
		
	}
	
	@Test
	void HayGanadorUnicoTest() {
		
		float pozo = 20000f;
		int boletos= 200;
		
		loteria = new Loteria(pozo,boletos, cartonGenerator);
		loteria.jugada();
		
		assertFalse(loteria.hayGanadorUnico());
		
	}
	
	@Test
	void HayCuadrupleGanadorTest() {
		
		float pozo = 20000f;
		int boletos= 200;
		
		loteria = new Loteria(pozo,boletos, cartonGenerator);
		loteria.jugada();
		
		assertFalse(loteria.hayCuadrupleGanador());
		
	}

}
