package com.loiane.cursojava.aula85_100;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {

		Calendar calendario = Calendar.getInstance();
		
		int ano = calendario.get(Calendar.YEAR);
		int mes = calendario.get(Calendar.MONTH);
		int semana = calendario.get(Calendar.WEEK_OF_MONTH);
		int dia = calendario.get(Calendar.DAY_OF_MONTH);
		int hora = calendario.get(Calendar.HOUR_OF_DAY);
		int minutos = calendario.get(Calendar.MINUTE);
		int segundos = calendario.get(Calendar.SECOND);
		
		System.out.printf("Hoje e: %d/%02d/%d - %02d:%02d:%02d", dia, mes, ano, hora, minutos, segundos);
		
		System.out.println();
		
		calendario.add(Calendar.DAY_OF_MONTH, 1);
		System.out.println(calendario.get(Calendar.DAY_OF_MONTH));
	}

}
