package com.loiane.cursojava.aula74.labs;

public enum CorSemafaro {

	VERMELHO(1000), AMARELO(200),VERDE(2000);
	
	private int tempoEspera;
	
	CorSemafaro(int tempoEspera){
		this.tempoEspera = tempoEspera;
	}
	public int getTempoEspera() {
		return tempoEspera;
	}
}
