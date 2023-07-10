package com.loiane.cursojava.aula68;

public class MinhaThreadRunnale implements Runnable {

	private String nome;
	private int tempo;

	public MinhaThreadRunnale(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		Thread t = new Thread(this);
		t.start();

	}

	@Override
	public void run() {
		try {
			for(int i=0; i<5; i++) {
				System.out.println(nome + " contator " + i);
				Thread.sleep(tempo);
			} 
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execucao ");
	}

}



