import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.com.gl.electrical.ElectricalOven;

public class AppTest {
	
	ElectricalOven electricalOven;
	
	@BeforeEach
	void beforeEach() {
		electricalOven = new ElectricalOven();
	}
	
	@Test
	void powerOnOvenTest() {
		
		int power = 1000;
		
		electricalOven.setPower(power);
		
		electricalOven.turnOn();
		
		assertEquals(power - 75, electricalOven.getPower());
	}
	
	@Test
	void powerledTest() {
		
		int power = 1000;
		
		electricalOven.setPower(power);
		
		electricalOven.turnLed();
		
		assertEquals(power -100, electricalOven.getPower());
		
	}

}
