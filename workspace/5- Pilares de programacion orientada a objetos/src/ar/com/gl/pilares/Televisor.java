package ar.com.gl.pilares;

public class Televisor extends Electrodomestico {

	private double pulgadas;
	private String resolucion;
	
	public void cambiarCanal(int canal) {
		
	}
	
	@Override
	public void encender() {
		System.out.println("Televisor encendida");
	}
}
