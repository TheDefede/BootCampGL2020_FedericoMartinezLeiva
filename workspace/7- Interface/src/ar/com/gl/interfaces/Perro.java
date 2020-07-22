package ar.com.gl.interfaces;

public class Perro implements InterfaceAnimal {

	@Override
	public void dormir() {
		System.out.println("Zzz");

	}

	@Override
	public void sonidoAnimal() {
		System.out.println("El perro hace guau gau");

	}

}
