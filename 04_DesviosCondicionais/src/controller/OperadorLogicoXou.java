package controller;

import util.Teclado;

public class OperadorLogicoXou {

	public static void main(String[] args) {

		int num;
		num = Teclado.lerInt("Informe um n�mero.");

		if ((num < 80) ^ (num > 60)) {
			System.out.println("O n�mero � menor que 80 ou maior que 60, mas n�o ambos.");
		} else {
			System.out.println("O n�mero est� entre 60 e 80.");
		}

	}

}