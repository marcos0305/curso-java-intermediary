package com.loiane.cursojava.aula76;

import java.security.ProtectionDomain;

public class Concatenação {

	public static void main(String[] args) {
		String curso = "Curso ";
		String java = "Java";
		
		String CursoJava = curso + java;
		System.out.println(CursoJava);
				
		String soma2Mais2 = "Resultado 2+2 = " + (2+2);
		System.out.println(soma2Mais2);
		
		String soma2Mais2_ = "Resultado 2+2 = " + 2 + 2;
		System.out.println(soma2Mais2_);
		
		String dois = String.valueOf(2);
		System.out.println(dois);
		
		
		 
	}
}
