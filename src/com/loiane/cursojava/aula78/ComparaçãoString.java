package com.loiane.cursojava.aula78;

public class ComparaçãoString {

	public static void main(String[] args) {

		String ola = "Ola";
		String ola2 = "OLA";
		String ola3 = "Ola";
		
		
		//Método equalsIgnoreCase
		System.out.println("ola equals ola2 = " + ola.equals(ola2));//false
		System.out.println("ola equals ola3 = " + ola.equals(ola3));//true
		
		System.out.println("ola equals ola2 = " + ola.equalsIgnoreCase(ola2));//true
		
		System.out.println("ola == ola1 " + (ola == ola2));//false
		System.out.println("ola == ola3 " + (ola == ola3));//true
		
		
		String banana = "banana";
		String ana = "ana";
		String ban = "ban";
		
		//Método regionMatches
		System.out.println(banana.regionMatches(1, ana, 0, 3));
		System.out.println(banana.regionMatches(2, ana, 1, 2));
		System.out.println(banana.regionMatches(true, 0, ban, 0, 3));
	
		//Método endsWith e startsWith
		System.out.println(banana.endsWith(ana));
		System.out.println(banana.startsWith(ban));
		
		//Método compareTo
		String a = "a";
		String b = "b";
		String aMaiusculo = "A";
		
		System.out.println(a.compareTo(b));
		System.out.println(a.compareTo(a));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo(aMaiusculo));
		
		//-1 quando a > b
		//0 quando a == b
		//1 ou  >1 quando a<b
		
		
		
	}

}
