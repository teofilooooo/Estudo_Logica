package controller;

import util.Teclado;

public class questao04 {

	public static void main(String[] args) {

		double peso, altura, imc;
		
		peso = Teclado.lerDouble("Infome seu peso");
		altura = Teclado.lerDouble("Informe sua altura");
		imc = peso / ((altura)*(altura)); // Calcular IMC
		
		System.out.println("O valor do seu IMC �: "+imc);
		
	}

}