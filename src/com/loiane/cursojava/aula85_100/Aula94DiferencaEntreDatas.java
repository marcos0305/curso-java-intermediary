package com.loiane.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Aula94DiferencaEntreDatas {

	public static void main(String[] args) {
		try {
			diferencaDataAteJava7();
		} catch (ParseException e) {
			e.printStackTrace();
		}

		System.out.println("----------------");

		diferencaDataJava8();

		System.out.println("----------------");

		diferencaDataJava8ComTime();
	}

	public static void diferencaDataAteJava7() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date primeiroDt = sdf.parse("01/02/2023");
		Date segundoDt = sdf.parse("01/03/2023");

		long diffEmMill = Math.abs(primeiroDt.getTime() - segundoDt.getTime());
		int dias = (int) (diffEmMill / (1000 * 60 * 60 * 24));
		long diff = TimeUnit.DAYS.convert(diffEmMill, TimeUnit.MILLISECONDS);
		System.out.println(diff);
		System.out.println(dias);
	}

	public static void diferencaDataJava8() {
		LocalDate data1 = LocalDate.of(2024, 02, 01);
		LocalDate data2 = LocalDate.of(2024, 03, 01);

		Period periodo = Period.between(data1, data2);// Period
		int dias = periodo.getDays();
		int meses = periodo.getMonths();
		int anos = periodo.getYears();
		
		System.out.println("Dias: " + dias);
		System.out.println("Meses: " + meses);
		System.out.println("Anos: " + anos);

	}

	public static void diferencaDataJava8ComTime() {
		LocalDateTime data1 = LocalDateTime.of(2019, 1, 1, 4, 5);
		LocalDateTime data2 = LocalDateTime.of(2019, 1, 1, 8, 5);

		Duration duracao = Duration.between(data1, data2);
		long diff = duracao.toHours();
		System.out.println(diff);

	}
}
