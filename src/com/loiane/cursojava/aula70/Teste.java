package com.loiane.cursojava.aula70;

import com.loiane.cursojava.aula69.MinhaThreadRunnable;

public class Teste {

	public static void main(String[] args) {
		MinhaThreadRunnable thread1 = new MinhaThreadRunnable("#1", 550);
		MinhaThreadRunnable thread2 = new MinhaThreadRunnable("#2", 550);
		MinhaThreadRunnable thread3 = new MinhaThreadRunnable("#2", 550);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.setPriority(4);
		t2.setPriority(5);
		t3.setPriority(1);

		// t1.setPriority(Thread.MIN_PRIORITY);

	}

}
