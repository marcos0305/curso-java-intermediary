package com.loiane.cursojava.aula85_100;

import java.text.DecimalFormat;

public class Aula97DecimalFormat {

	public static void main(String[] args) {

		double number = 254151.514;
		
		String padrao = "###.###,##";
		DecimalFormat df = new DecimalFormat();
		System.out.println(df.format(number));
		
		String padrao2 = "###,###,###.##";
		df = new DecimalFormat(padrao2);
		df.setGroupingSize(4);
		System.out.println(df.format(number));
		
		String padrao3 = "###,###.000%";
		df = new DecimalFormat(padrao3);
		System.out.println(df.format(0.1));
		
		
	}
	
}
