package com.loiane.cursojava.aula63;

public class ExemploPrintf {

	public static void main(String[] args) {

		System.out.printf("%s", "Hello world!");
		System.out.println();
		System.out.printf("%S", "Hello world!");
		System.out.println();

		System.out.printf("%c", 'd');
		System.out.println();
		System.out.printf("%C", 'd');

		System.out.printf("%n"); // quebra de linha

		int valor = 123456;
		System.out.printf("%d", valor);
		System.out.println();

		double pontoFlutuante = 3.25489;
		System.out.printf("%f", pontoFlutuante);
		System.out.println();

		String helloWorld = "Hello World!";
		System.out.printf("%20s", helloWorld);
		System.out.println();
		System.out.printf("%-20s", helloWorld);
		System.out.println();

		System.out.printf("%+d", valor);
		System.out.println();
		System.out.printf("%,d", valor);
		System.out.println();
		System.out.printf("%013d", valor);
		System.out.println();

		int valor2 = -123456;
		System.out.printf("% d", valor2);
		System.out.println();
		System.out.printf("% d", valor);
		System.out.println();

		System.out.printf("%.3f", pontoFlutuante);
		System.out.println();

		System.out.printf("R$%.3f", pontoFlutuante);
		System.out.println();

		testeMaisCompleto();

	}

	private static void testeMaisCompleto() {

		double[] precos = { 1000, 12.3545, 524.655, 5, 7.3219864 };

		for (int i = 0; i < precos.length; i++) {
			System.out.printf("%s %03d: total de R$%,10.2f%n", "Item", i + 1, precos[i]);
		}

	}
}
