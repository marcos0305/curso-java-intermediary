package com.loiane.cursojava.aula85_100;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GreogorianCalendar {

	public static void main(String[] args) {
		Calendar hoje1 = Calendar.getInstance();
		GregorianCalendar hoje = new GregorianCalendar();

		imprimirData(hoje);
	}

	private static void imprimirData(Calendar hoje) {
		int ano = hoje.get(Calendar.YEAR);
		int mes = hoje.get(Calendar.MONTH); 
		int semana = hoje.get(Calendar.WEEK_OF_MONTH);
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		int minutos = hoje.get(Calendar.MINUTE);
		int segundos = hoje.get(Calendar.SECOND);

		System.out.printf("Hoje e: %d/%02d/%d - %02d:%02d:%02d", dia, mes, ano, hora, minutos, segundos);
	}
}
