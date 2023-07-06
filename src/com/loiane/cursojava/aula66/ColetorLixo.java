package com.loiane.cursojava.aula66;

import com.loiane.cursojava.aula61.Contato;

public class ColetorLixo {

	public static void main(String[] args) {

		Contato[] contatos = new Contato[1000];
		Contato contato;

		for (int i = 0; i < contatos.length; i++) {
			contato = new Contato("Contato" + i, "1254-6554" + i, "contato" + i + "@gmail.com");
			contatos[i] = contato;

		}
		System.out.println("Contatos criados");
		contatos = null;
	}
}
