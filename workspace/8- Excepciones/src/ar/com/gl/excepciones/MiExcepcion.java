package ar.com.gl.excepciones;

public class MiExcepcion extends Exception {
	
	private String mensaje = "Mi propia excepcion";
	
	public void mostrarMensaje() {
		
		System.out.println(mensaje);
	}

}
