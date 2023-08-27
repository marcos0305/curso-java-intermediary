package com.loiane.cursojava.aula85_100;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Aula98BigIntegerbigDecimal {

	public static void main(String[] args) {
		
		double a = 0.03;
		double b = 0.04;
		double c = b - a;
		System.out.println(c);
		
		BigDecimal _c = new BigDecimal("0.03");
		BigDecimal _d = new BigDecimal("0.04");
		BigDecimal _e = _d.subtract(_c);
		System.out.println(_e);
		
		BigInteger d = new BigInteger("545");
		BigInteger e = new BigInteger("545");
		BigInteger f = e.subtract(d);
		System.out.println(f);
	}
}
