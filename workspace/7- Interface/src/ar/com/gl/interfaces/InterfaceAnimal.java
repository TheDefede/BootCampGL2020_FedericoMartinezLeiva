package ar.com.gl.interfaces;

public interface InterfaceAnimal {
	
	public void dormir();
	public void sonidoAnimal();
	
	public default void Come(String s) {
		System.out.println("El " + s + " se alimenta ");
	}
	
	public static void Camina(String s) {
		System.out.println("El " + s + " camina");
	}

}
