package ar.com.gl.interfaces;

public class Hombre implements Persona, InterfaceAnimal {

	@Override
	public void sonidoAnimal() {
		
		System.out.println("El hombre no hace sonidos de animal");
	}

	@Override
	public void hablar() {
		// TODO Auto-generated method stub
		System.out.println("Las personas hablan mucho");
	}

	@Override
	public void dormir() {
		
		System.out.println("El hombre duerme muchas horas");
	}

	public static void main(String[] args) {
		
		Hombre persona = new Hombre();
		
		persona.dormir();
		persona.hablar();
		persona.sonidoAnimal();
		persona.come();
		

	}

}
