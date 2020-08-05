package ar.com.gl.electrical;

public class ElectricalAppliance {

	private int power = 500;
	
	public ElectricalAppliance() {
		
	}
	
	public void turOn() {
		this.setPower(this.getPower() - 50);
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
}
