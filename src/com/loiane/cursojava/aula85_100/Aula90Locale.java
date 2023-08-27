package com.loiane.cursojava.aula85_100;

import java.text.NumberFormat;
import java.util.Locale;

public class Aula90Locale {

	public static void main(String[] args) {

		Locale local = Locale.getDefault();

		System.out.println(local);

		Locale[] locales = Locale.getAvailableLocales();
		for (Locale loc : locales) {
			System.out.println("Nome: " + loc.getDisplayName());
			System.out.println("Codigo do pais: " + loc.getLanguage());
			System.out.println("Nome: " + loc.getDisplayLanguage());
			System.out.println("Nome: " + loc.getDisplayCountry());

			System.out.println("--------------------------");
		}

		Locale br = new Locale("pt", "Brazil");
		System.out.println(br);

		Locale.setDefault(br);
		System.out.println(Locale.getDefault());

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		System.out.println(nf.format(500000000d));

		NumberFormat nf1 = NumberFormat.getCurrencyInstance(Locale.KOREA);
		System.out.println(nf1.format(500000000d));

	}
}
