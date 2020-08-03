package ar.com.gl.pilares;

public class Heladera extends Electrodomestico{
	
	// entiendo que no se le suele poner public a los atributos de clase pero para los propositos de este ejemplo
	// para usar el getFields() solo muestro los publicos
	public double capacidad;
	public boolean tieneFreezer;
	public double capacidadFreezer;
	
	public void guardarElemento(String elementos) {
		
	}
	
	public void extraerElemento(String elemento) {
		
	}
	
	@Override
	public void encender() {
		System.out.println("Heladera encendida");
	}

}
