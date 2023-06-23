package com.loiane.cursojava.aula59;


import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
//import static java.lang.Math.*;


public class SataticImport {

	public static void main(String[] args) {

		double a = 2;
		double b = 4;
		double c = 8;
		
		//sem import
		System.out.println(Math.pow(a, b));
		System.out.println(Math.sqrt(c));
		
		//com import 
		System.out.println(pow(a,c));
		System.out.println(sqrt(b));
	}
}
