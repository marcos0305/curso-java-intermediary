package com.loiane.cursojava.aula58;

public class TesteAutoboxing {

	public static void main(String[] args) {

		// autoboxing

		Short num1 = 1;
		Byte num2 = 10;
		Integer num3 = 100;
		Long num4 = 1000l; // new Long(1000l);
		Float num5 = 3.5f; // new Float(3.5f);
		Double num6 = 3.44;
		Boolean flag2 = true;
		Character b_ = 'b';

		// auto un-boxing

		int num7 = num3; // num3.intValue();

		// autoboxing em expressoes

		num3++;
		System.out.println(num3);

		// auto unboxing num3 -> autoboxing num2/num3 -> num8
		Integer num8 = num2 / num3;

	}

}
