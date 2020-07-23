package controller;

import util.Teclado;

public class Questao10 {

	public static void main(String[] args) {
		/*
		 * 10) Desenvolver um programa que crie uma matriz a com 3 linhas e 5 colunas e
		 * um vetor b com 5 itens. Perguntes ao usuário os números para preencher a
		 * matriz. O programa deverá somar todos os itens de uma mesma coluna da matriz
		 * e guardar o resultado na posição correspondente a esta coluna no vetor. Ao
		 * final o programa deverá exibir a matriz e o vetor.
		 */

		double a[][] = new double[3][5];
		double b[] = new double[5];

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				a[i][j] = Teclado.lerDouble("Informe um número.");
			}
		}

		for (int i = 0; i < a[0].length; i++) {
			double aux = 0;
			for (int j = 0; j < a.length; j++) {
				aux = aux + a[j][i];
			}
			b[i] = aux;

		}

		System.out.println("Matriz");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		System.out.println("Vetor");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

}