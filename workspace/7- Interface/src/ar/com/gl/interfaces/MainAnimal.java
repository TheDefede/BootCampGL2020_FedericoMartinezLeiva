package ar.com.gl.interfaces;

public class MainAnimal {

	public static void main(String[] args) {
		
		Perro dog = new Perro();
		
		dog.dormir();
		dog.sonidoAnimal();
		
		dog.Come("perro");
		
		InterfaceAnimal.Camina("perro");

	}

}
