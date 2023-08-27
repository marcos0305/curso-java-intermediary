package com.loiane.cursojava.aula85_100;

import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

public class Aula92TimeZone {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		TimeZone tz = calendar.getTimeZone();
		System.out.println(tz);

//		String[] fusos = TimeZone.getAvailableIDs();
//		for (String fuso : fusos) {
//		System.out.println(fuso);

		TimeZone tzBR = TimeZone.getTimeZone("America/Sao_Paulo");

		System.out.println(tzBR.getDisplayName());
		System.out.println(tzBR.getID());
	}
}
