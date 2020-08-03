package ar.com.gl.excepciones;

public class ClaseMain82 {

	public static void main(String[] args) {
		
		Integer entero = null;
		
		try {
			entero.byteValue();
		} catch (Exception e) {
			
			System.out.println("Se produjo una exepcion. null");
		}
		
		

	}

}
