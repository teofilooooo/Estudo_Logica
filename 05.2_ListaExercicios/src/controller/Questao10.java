package controller;

import util.Teclado;

public class Questao10 {

	/*
	 * A s�rie de Ricci difere da s�rie de Fibonacci porque os dois primeiros termos
	 * s�o fornecidos pelo usu�rio. O restante da s�rie � calculado da mesma forma
	 * que na s�rie de Fibonacci. Altere o programa da quest�o anterior, para que
	 * sejam perguntados os dois primeiros termos da s�rie de Ricci, e sejam
	 * exibidos os 15 termos subsequentes desta s�rie.
	 */
	public static void main(String[] args) {

		int a, s, i = 0, aux;
		a = Teclado.lerInt("Informe o primeiro termo: ");
		s = Teclado.lerInt("Informe o segundo termo: ");

		System.out.println(a);
		do {
			System.out.println(s);
			aux = a + s;
			a = s;
			s = aux;
			i++;

		} while (i <= 13);
	}

}
