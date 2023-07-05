package com.loiane.cursojava.aula65;

@interface InformacaoAula {

	String nome();

	int aulaNumero();

	String blog() default "http://marcos.com";

	String site() default "http://marcos.training";

}
