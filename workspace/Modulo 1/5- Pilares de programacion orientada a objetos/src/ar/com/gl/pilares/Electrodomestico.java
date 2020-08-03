package ar.com.gl.pilares;

public class Electrodomestico {
	
	// entiendo que no se le suele poner public a los atributos de clase pero para los propositos de este ejemplo
	// para usar el getFields() solo muestro los publicos
	public String marca;
	public double peso;
	public char consumo;
	public String color;
	
	public void encender() {
		System.out.println("Electrodomestico prendido");
	}
	
	public void apagar() {
		System.out.println("Electrodomestico apagado");
	}

	
	

}
