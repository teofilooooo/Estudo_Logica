package controller;

import util.Teclado;

public class Questao12 {

	/*
	 * Desenvolver um programa que pergunte 5 n�meros inteiros e identifique o maior
	 * n�mero e o menor n�mero.
	 */

	public static void main(String[] args) {

		int num1, num2, num3, num4, num5, maior, menor;
		num1 = Teclado.lerInt("Informe um n�mero.");
		num2 = Teclado.lerInt("Informe outro n�mero.");
		num3 = Teclado.lerInt("Informe outro n�mero.");
		num4 = Teclado.lerInt("Informe outro n�mero.");
		num5 = Teclado.lerInt("Informe outro n�mero.");

		maior = num1;
		menor = num1;

		if (num2 > maior) {
			maior = num2;
		}
		if (num3 > maior) {
			maior = num3;
		}
		if (num4 > maior) {
			maior = num4;
		}
		if (num5 > maior) {
			maior = num5;
		}
		
		if (num2 < menor) {
			menor = num2;
		}
		if (num3 < menor) {
			menor = num3;
		}
		if (num4 < menor) {
			menor = num4;
		}
		if (num5 < menor) {
			menor = num5;
		}
		System.out.println("O maior n�mero � o: " + maior);
		System.out.println("O menor n�mero � o: " + menor);

	}

}