package com.loiane.cursojava.aula85_100;

public class Aula85Math {

	public static void main(String[] args) {

		// Pow
		System.out.println(Math.pow(2, 2));
		System.out.println(Math.pow(6, 1));

		// Round
		System.out.println(Math.round(6.6));
		System.out.println(Math.round(6.4));

		// Ceil
		System.out.println(Math.ceil(4.4));
		System.out.println(Math.ceil(4.8));

		// Floor
		System.out.println(Math.floor(4.4));
		System.out.println(Math.floor(4.6));

		// Random
		System.out.println(Math.random());
		System.out.println(Math.round(Math.random() * 5));

		// Sin
		System.out.println(Math.sin(Math.toRadians(30)));

		// Cos
		System.out.println(Math.cos(Math.toRadians(1)));
		
		// Tan
		System.out.println(Math.tan(Math.toRadians(45)));
	}

}
