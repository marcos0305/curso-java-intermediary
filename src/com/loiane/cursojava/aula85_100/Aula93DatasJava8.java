package com.loiane.cursojava.aula85_100;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Aula93DatasJava8 {

	public static void main(String[] args) {
		
		// DATA dd-MM-yyyy
		 LocalDate hj = LocalDate.now();
		 System.out.println(hj);
	
		 System.out.println(LocalDate.of(2024, 5, 25));
		 System.out.println(LocalDate.parse("2026-05-24"));
		 System.out.println(hj.plusDays(30));
		 System.out.println(hj.minusMonths(2));
		 System.out.println(hj.getDayOfWeek());
		 System.out.println(hj.isLeapYear());
		 
		 //Horario
		 LocalTime hr = LocalTime.now();
		 System.out.println(hr);
		 System.out.println(LocalTime.of(21, 55));
		 System.out.println(LocalTime.parse("21:46:21"));
		 System.out.println(hr.plusMinutes(5));
		 System.out.println(hr.minus(25, ChronoUnit.HOURS));
		 System.out.println(hr.getSecond());
		 
		 //Data completa = data + horario
		 LocalDateTime agoraCompleto = LocalDateTime.now();
		 System.out.println(agoraCompleto);
		 System.out.println(LocalDateTime.of(2023, 05, 03, 22, 06, 10));
		 System.out.println(LocalDateTime.parse("2023-05-03T22:06:10"));
		 System.out.println(agoraCompleto.plusYears(2));
		 
	}
}
