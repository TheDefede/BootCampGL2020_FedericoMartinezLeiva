package ar.com.gl.interfaces;

public interface Persona {
	
	public void hablar();
	public void dormir();
	public default void come() {
		System.out.println("Commiendo una hamburguesa");
	};

}
