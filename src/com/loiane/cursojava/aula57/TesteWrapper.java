package com.loiane.cursojava.aula57;

public class TesteWrapper {

	public static void main(String[] args) {

		short num1 = 1;
		byte num2 = 10;
		int num3 = 100;
		long num4 = 10000l;
		float num5 = 3.5f;
		double num6 = 3.55555;
		boolean flag = true;
		char b = 'b';

		Short num7 = new Short((short) 1);
		Byte num8 = new Byte((byte) 10);
		Integer num9 = new Integer((int) 100);
		Long num10 = new Long((long) 10000l);
		Float num11 = new Float((float) 3.5f);
		Double num12 = new Double((double) 3.55555);
		Boolean flag3 = new Boolean((boolean) true);
		Character a = new Character('a');

		Integer num13 = new Integer(10000);
		Double num14 = new Double("3.5");

		System.out.println(num13.intValue());
		Long num15 = num13.longValue();

		int num16 = Integer.parseInt("555555");
		double num17 = Double.parseDouble("3.6");
		System.out.println(num17);

		Integer num18 = Integer.valueOf(1254);
		System.out.println(num18);  
		
		System.out.println(num9 = num13);
	}
}
