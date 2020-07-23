package controller;

import util.Teclado;

public class Questao05 {

	public static void main(String[] args) {
		/*
		 * Desenvolver um programa que crie uma matriz de 4 linhas e 4 colunas. Pergunte
		 * ao usuário nomes de pessoas para preencher toda a matriz. Em seguida o
		 * programa perguntará ao usuário as coordenadas (linha e coluna) que deseja
		 * visualizar o conteúdo correspondente na matriz. Enquanto o usuário informar
		 * coordenadas válidas, o programa exibirá o conteúdo correspondente. No momento
		 * em que forem inseridas coordenadas não válidas o programa será encerrado com
		 * a mensagem na tela “Coordenadas inválidas”.
		 */

		String a[][] = new String[4][4];

		// perguntando matriz
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = Teclado.lerTexto("Informe um nome.");

			}
		}
		int l = 0, c = 0;
		while (l >= 0 && l < a.length && c >= 0 && c < a[0].length) {

			System.out.println("Informe a posição da matriz.");

			l = Teclado.lerInt("Informe a 'linha'.");
			c = Teclado.lerInt("Informe a 'coluna'.");
			if (l >= 0 && l < a.length && c >= 0 && c < a[0].length) {
				System.out.println(a[l][c]);
			}
		}
		System.out.println("Coordenadas inválidas.");
	}

}