package ar.com.gl.excepciones;

public class PropiaClaseExcepcion {

	public static void main(String[] args) {
		
		MiExcepcion exc = new MiExcepcion();
		
		try {
			throw exc;
		} catch (MiExcepcion e) {
			
			e.mostrarMensaje();
		}

	}

}
