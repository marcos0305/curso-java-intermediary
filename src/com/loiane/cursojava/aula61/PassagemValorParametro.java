package com.loiane.cursojava.aula61;

public class PassagemValorParametro {

	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1", "1234-5678", "contato@gmail.com");
		int valor = 10;
		
		System.out.println("VALORES ORIGINAIS" );
		
		System.out.println(contato);
		System.out.println(valor);
		
		
		System.out.println("EXEMPLO 1");
		testePassagemValorReferencia(valor, contato);
		
		System.out.println(contato);
		System.out.println(valor);
		
		System.out.println("EXEMPLO 2" );
		
		testePassagemValorReferencia2(valor, contato);
		System.out.println(contato);
		System.out.println(valor);
	}

	private static void testePassagemValorReferencia(int valor, Contato contato) {

		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato ("Contato 2", "2234-5488", "contato2@gmail.com");
	}
	private static void testePassagemValorReferencia2(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato" + novoValor);
	}
}
