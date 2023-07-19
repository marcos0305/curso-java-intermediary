package com.loiane.cursojava.aula79;

public class FazendoBuscas {

	public static void main(String[] args) {
		
		String banana = "banana";
		String ana = "ana";
		
		//Metodo indexOf
		System.out.println(banana.indexOf('x'));
		System.out.println(banana.indexOf('a'));
		System.out.println(banana.indexOf('b'));
		System.out.println(banana.indexOf(ana));
		
		
		//Metodo lastIndexOf
		System.out.println(banana.lastIndexOf('b'));
		System.out.println(banana.lastIndexOf(ana));
		
		//Metodo contains
		System.out.println(banana.contains(ana));
		System.out.println(banana.contains("ban"));
		
	}
}
