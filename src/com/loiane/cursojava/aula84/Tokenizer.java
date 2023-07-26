package com.loiane.cursojava.aula84;

import java.util.StringTokenizer;

public class Tokenizer {

	public static void main(String[] args) {
		
		String doArquivo = "1;Lucas;45";
		
		StringTokenizer sd = new StringTokenizer(doArquivo, ";");
			while(sd.hasMoreTokens()) {
				System.out.println(sd.nextToken());
			}
		}
}
