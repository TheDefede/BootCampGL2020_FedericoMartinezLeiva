package ar.com.gl.estructuras.entity;

import java.util.ArrayList;
import java.util.List;

public class PrimeraLista {

	public static void main(String[] args) {
		
		List<String> letters = new ArrayList<>();
		
		letters.add("A");
		letters.add("B");
		letters.add("C");
		
		for (String letter : letters) {
			System.out.println(letter);
		}
		
		System.out.println(letters.size());
		
		letters.add(0,"x");
		
		for (String letter : letters) {
			System.out.println(letter);
		}
	}

}
