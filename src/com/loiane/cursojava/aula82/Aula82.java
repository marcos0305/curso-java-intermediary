package com.loiane.cursojava.aula82;

public class Aula82 {

	public static void main(String[] args) {

		//Metodo join
		String alfabeto = String.join(", ", "A", "B", "C");
		System.out.println(alfabeto);
		
		//Metodo split
		String[] letras = alfabeto.split(", ");
		for(String letra : letras) {
			System.out.println(letra);
		}
	}

}
