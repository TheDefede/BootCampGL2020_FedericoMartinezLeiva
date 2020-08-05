package ar.com.gl.electrical;

public class ElectricalOven extends ElectricalAppliance {
	
	LedAppliance ledAppliance;
	
	public ElectricalOven() {
		super();
		ledAppliance = new LedAppliance();
	}

	public void turnOn() {
		this.setPower(this.getPower() - 75);
	}
	
	public void turnLed() {
		this.setPower(ledAppliance.turnOn(this.getPower()));
	}
}
