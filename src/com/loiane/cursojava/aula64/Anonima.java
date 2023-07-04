package com.loiane.cursojava.aula64;

public class Anonima {

	public void imprimirTexto() {
		System.out.println("qualquer texto");
	}
	public static void main(String[] args) {
		
		Anonima anonima = new Anonima() {
			public void imprimirTexto() {
				System.out.println("qualquer texto que foi sobrescrito");
			}
		};
		anonima.imprimirTexto();
	}
}
