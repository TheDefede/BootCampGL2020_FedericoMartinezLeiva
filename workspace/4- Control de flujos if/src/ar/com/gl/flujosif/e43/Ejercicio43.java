package ar.com.gl.flujosif.e43;

public class Ejercicio43 {
	public static void main(String[] args) {
		
		int compra = 400;
		double descuento;
		
		if (compra == 300) {
			descuento = compra * 0.2;
			System.out.println("El descuento es de : " + descuento);
		} else if(compra > 350) {
			descuento = compra * 0.25;
			System.out.println("El descuento es de : " + descuento);
		}else {
			System.out.println("Sin descuento, el total es: " + compra);
		}
		
		
	}
	

}
