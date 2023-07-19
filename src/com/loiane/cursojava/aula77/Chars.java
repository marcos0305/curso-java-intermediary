package com.loiane.cursojava.aula77;

import java.util.Arrays;

public class Chars {

	public static void main(String[] args) {

		String java = "Java";

		for (int i = 0; i < java.length(); i++) {
		System.out.println(java.charAt(i));
		// charAt
		}

		char[] jav = new char[3];
		java.getChars(0, 3, jav, 0);
		System.out.println(jav);
		// getChars

		byte[] javaBytes = new byte[3];
		java.getBytes(0, 3, javaBytes, 0);
		System.out.println(Arrays.toString(javaBytes));
		// getBytes

		char[] javaChars = java.toCharArray();
		System.out.println(javaChars);
		// toCharArray
	}

}
