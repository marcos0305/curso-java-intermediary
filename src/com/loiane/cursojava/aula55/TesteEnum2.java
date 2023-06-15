package com.loiane.cursojava.aula55;

import com.loiane.cursojava.aula53.DiaSemana;

public class TesteEnum2 {

	public static void main(String[] args) {

		System.out.println(DiaSemana.valueOf(DiaSemana.class, "SEGUNDA"));
		
		DiaSemana dia = Enum.valueOf(DiaSemana.class, "TERCA");

		System.out.println(dia);
	}

}
