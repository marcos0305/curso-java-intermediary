package com.loiane.cursojava.aula68;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnale thread1 = new MinhaThreadRunnale("#01", 900);
		//Thread t1 = new Thread(thread1);
		//t1.start();
		MinhaThreadRunnale thread2 = new MinhaThreadRunnale("#02", 10000);
	}
}
