package com.loiane.cursojava.aula85_100;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Aula91DateFormat {

	public static void main(String[] args) {

		Date hoje = new Date();
		System.out.println(Locale.getDefault());
		

		String hojeFormatado = DateFormat.getInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		Locale.setDefault(new Locale("pt", "Brazil"));
		
		hojeFormatado = DateFormat.getTimeInstance().format(hoje);
		System.out.println(hojeFormatado);

		hojeFormatado = DateFormat.getDateInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance().format(hoje);
		System.out.println(hojeFormatado);
		
		hojeFormatado = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.LONG).format(hoje);
		System.out.println(hojeFormatado);

	}
}
