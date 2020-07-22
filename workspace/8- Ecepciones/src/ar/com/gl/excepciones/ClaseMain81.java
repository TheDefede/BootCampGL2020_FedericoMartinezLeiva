package ar.com.gl.excepciones;

public class ClaseMain81 {

	public static void main(String[] args) {


		try {
			
			Exception exc = new Exception("Se produjo una exepcion: esto es una excepcion");
			
			throw exc;	
			
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		
			
		}finally {
			System.out.println("Esto se ejecuta sin importar si se presentan errores");
		}

	}

}
