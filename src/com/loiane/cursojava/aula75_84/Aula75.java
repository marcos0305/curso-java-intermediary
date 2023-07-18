package com.loiane.cursojava.aula75_84;

public class Aula75 {

	public static void main(String[] args) {

		String vazia = new String();
		System.out.println(vazia);
		
		String java = new String("Java");
		System.out.println(java);
		
		String java1 = new String(java);
		System.out.println(java1);
		
		char[] charJava = {'J', 'A', 'V', 'A'};
		String java2 =  new String(charJava);
		System.out.println(java2);
		
		char[] abcde = {'A','B','C','D'};
		String abc = new String(abcde, 0, 3);
		System.out.println(abc);
		
		byte[] ascii = {65,66,67,68,69};
		String abcdef = new String(ascii);
		System.out.println(abcdef);
		
		String bcd = new String(ascii , 1, 3);
		System.out.println(bcd);
		
		String java3 = "Java";
		String java4 = "Java";
		
		System.out.println(java3);
		System.out.println(java4);
 	}

}
