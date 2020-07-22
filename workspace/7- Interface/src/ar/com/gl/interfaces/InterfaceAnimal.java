package ar.com.gl.interfaces;

public interface InterfaceAnimal {
	
	public void dormir();
	public void sonidoAnimal();
	
	public default void come(String s) {
		System.out.println("El " + s + " se alimenta ");
	}
	
	public static void camina(String s) {
		System.out.println("El " + s + " camina");
	}

}
