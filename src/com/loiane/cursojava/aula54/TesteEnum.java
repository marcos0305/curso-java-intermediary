package com.loiane.cursojava.aula54;

public class TesteEnum {

	public static void main(String[] args) {

		DiaSemana dia = DiaSemana.TERCA;

		System.out.println(dia.toString() + " - " + dia.getValor());

		Data data = new Data(15, 6, 2023, DiaSemana.QUINTA);

	}

}
