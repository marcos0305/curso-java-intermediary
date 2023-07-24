package com.loiane.cursojava.aula80;

public class Modificadores {

	public static void main(String[] args) {

		String teste = "Isso e um teste.";
		
		//Substring
		System.out.println(teste.substring(10));
		System.out.println(teste.substring(10, 15));
		
		//Concat
		String ola = "ola ";
		String mundo = "mundo";
		String olaMundo = ola.concat(mundo);
		System.out.println(olaMundo);
		
		//Replace
		String espacos = "i s p a c o";
		String semEspacos = espacos.replace('i', 'e');
		System.out.println(semEspacos);
		
		//Trim
		String nome = " meu nome: ";
		System.out.println(nome);
		System.out.println(nome.trim());
	}
}
