package com.loiane.cursojava.aula62;

public class Varargs {

	public static void main(String[] args) {

		int[] vetor = { 1, 2, 3, 4, 5 };
		System.out.println(soma(vetor));

		
		System.out.println(soma(1, 2, 3, 4, 5, 6, 7, 8, 9));
	}

	static int soma(int[] vetor) {

		int total = 0;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}

	// VARARGS
	static int soma(Integer... vetor) {
		int total = 0;
		for (int i=0; i< vetor.length; i++) {
			total += vetor[i];
		}
		return total;
	}
}
