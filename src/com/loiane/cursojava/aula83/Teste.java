package com.loiane.cursojava.aula83;

public class Teste {

	public static void main(String[] args) {

		String[] letras = {"A", "B", "C", "D"};
		String alfabeto = "";
		
		for(String letra : letras) {
			alfabeto += letra;						
		}
		System.out.println(alfabeto);
		
		//Metodo buffer
		StringBuffer sb = new StringBuffer();
		for(String letra: letras) {
			sb.append(letra);
		}
		alfabeto = sb.toString();
		System.out.println(alfabeto);
		
		
		//Metodo Builder
		StringBuilder dc = new StringBuilder() ;
		for(String letra : letras) {
			dc.append(letra);
		}
		alfabeto = dc.toString();
		System.out.println(alfabeto);
	}

}
