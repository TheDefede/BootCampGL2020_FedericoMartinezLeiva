package ar.com.gl.excepciones;

public class ClaseMain84 {

	public static void main(String[] args) {
		
		int[] arrayEnteros = {1,2,3,4};
		
		
		
		try {
			System.out.println(arrayEnteros[4]);
		} catch (Exception e) {
			
			System.out.println("Excepcion: indice de array fuera de limites");
		}

	}

}
