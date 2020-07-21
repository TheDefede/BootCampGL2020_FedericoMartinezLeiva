package ar.com.gl.pilares;

public class Ejercicio53 {
	public static void main(String[] args) {
		
		Gato gato = new Gato();
		
		gato.setNombre("Kelly");
		gato.setPatas(4);
		
		System.out.println("Mi gato se llama " + gato.getNombre() + 
				" y tiene " + gato.getPatas() + " patas");
	}

}
