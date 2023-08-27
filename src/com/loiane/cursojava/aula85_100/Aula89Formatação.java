package com.loiane.cursojava.aula85_100;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Aula89Formatação {

	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy - HH:mm:ss z");
		Calendar data = new GregorianCalendar(2019, 4, 15, 16, 32, 25);

		System.out.println(sdf.format(data.getTime()));
		
		Date hoje = new Date();
		System.out.println(sdf.format(hoje));
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyy");
		String minhaData = "14/05/2003";
		
		try {
			Date minhaDataEmDate = sdf1.parse(minhaData);
			
			System.out.println(minhaDataEmDate);
			System.out.println(sdf.format(minhaDataEmDate));
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}
}
