package controller;

import util.Teclado;

public class Questao04 {

	public static void main(String[] args) {

		double num;
		num = Teclado.lerInt("Informe um n�mero.");
		if (num % 4 == 0 && num % 5 == 0) {
			System.out.println("O n�mero informado � divisivel por 4 e 5.");
			System.out.println("O n�mero informado foi: " + num);
		} else {
			System.out.println("O valor n�o � divisivel por 4 e 5 simultaneamente.");
		}
	}

}
