package ar.com.gl.interfaces;

public class MainAnimal {

	public static void main(String[] args) {
		
		Perro dog = new Perro();
		
		dog.dormir();
		dog.sonidoAnimal();
		
		dog.come("perro");
		
		InterfaceAnimal.camina("perro");

	}

}
