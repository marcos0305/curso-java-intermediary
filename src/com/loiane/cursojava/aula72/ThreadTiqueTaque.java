package com.loiane.cursojava.aula72;

public class ThreadTiqueTaque implements Runnable {

	TiqueTaque tt;
	Thread t;

	final int NUM = 6;

	public ThreadTiqueTaque(String nome, TiqueTaque tt) {
		this.tt = tt;
		new Thread(this, nome).start();
	}

	@Override
	public void run() {

		if (t.getName().equalsIgnoreCase("Tique")) {
			for (int i = 0; i < NUM; i++) {
				tt.tique(true);
			}
			
			tt.tique(false);
		} else {
			for (int i = 0; i < NUM; i++) {
				tt.taque(true);
			}
			tt.taque(false);
		}
	}

}
