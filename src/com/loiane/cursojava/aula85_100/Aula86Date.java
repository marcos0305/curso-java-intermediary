package com.loiane.cursojava.aula85_100;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {

		Date hoje = new Date();
		System.out.println(hoje);

		System.out.println(hoje.getDate());
		System.out.println(hoje.getHours());
		System.out.println(hoje.getSeconds());
	}
}