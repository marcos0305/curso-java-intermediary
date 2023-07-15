package com.loiane.cursojava.aula74;

public class Deadlocks {

	public static void main(String[] args) {

		final String RECUS01 = "Recuso #1";
		final String RECUS02 = "Recuso #2";

		Thread t1 = new Thread() {

			public void run() {
				synchronized (RECUS01) {
					System.out.println("Thread #1: bloqueou recuso 1");

					try {
						Thread.sleep(120);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread #2: tendando o acesso ao recurso 2");

					synchronized (RECUS02) {
						System.out.println("Thread #2: bloqueou recuso 2");
					}
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (RECUS02) {
					System.out.println("Thread #2: bloqueou recurso 2");

					try {
						Thread.sleep(120);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					System.out.println("Thread #2: tentando o acesso ao recurso 1");

					synchronized (RECUS01) {
						System.out.println("Thread #2: bloqueou recurso 1");
					}
				}
			}
		};
		t1.start();
		t2.start();
	}
}
