package com.loiane.cursojava.aula53;

public class Teste {

	public static void main(String[] args) {
		
		usandoConstantes();
		
		System.out.println();
		
		usandoEnum();

	}
	
	private static void usandoConstantes() {
		int segunda = DiaSemanaConstantes.SEGUNDA;
		int terca = DiaSemanaConstantes.TERCA;
		int quarta = DiaSemanaConstantes.QUARTA;
		int quinta = DiaSemanaConstantes.QUINTA;
		int sexta = DiaSemanaConstantes.SEXTA;
		int sabado = DiaSemanaConstantes.SABADO;
		int domingo = DiaSemanaConstantes.DOMINGO;
		
		System.out.println("Teste utilizando constantes no Java");
		imprimirDiaSemana(segunda);
		imprimirDiaSemana(terca);
		imprimirDiaSemana(quarta);
		imprimirDiaSemana(quinta);
		imprimirDiaSemana(sexta);
		imprimirDiaSemana(sabado);
		imprimirDiaSemana(domingo);
	}

	private static void imprimirDiaSemana(int dia) {
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terca-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sabado-feira");
			break;
		case 7:
			System.out.println("Domingo-feira");
			break;		
		}
	}
	public static void usandoEnum() {
		
		DiaSemana segunda = DiaSemana.SEGUNDA;
		DiaSemana terca = DiaSemana.TERCA;
		DiaSemana quata = DiaSemana.QUARTA;
		DiaSemana quinta = DiaSemana.QUINTA;
		DiaSemana sexta = DiaSemana.SEXTA;
		DiaSemana sabado = DiaSemana.SABADO;
		DiaSemana domingo = DiaSemana.DOMINGO;
		
		System.out.println("Teste utilizando enum no Java");
	}
	private static void imprimirDiaSemana(DiaSemana dia) {
		switch (dia) {
		case SEGUNDA:
			System.out.println("Segunda-feira");
			break;
		case TERCA:
			System.out.println("Terça-feira");
			break;
		case QUARTA:
			System.out.println("Quarta-feira");
			break;
		case QUINTA:
			System.out.println("Quinta-feira");
			break;
		case SEXTA:
			System.out.println("Sexta-feira");
			break;
		case SABADO:
			System.out.println("Sabado-feira");
			break;
		case DOMINGO:
			System.out.println("Domingo-feira");
			break;		
		}
	}
}