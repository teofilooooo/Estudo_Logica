package controller;

import util.Teclado;

public class questao10 {

	public static void main(String[] args) {
		
		int t, r, termo5;
		
		t = Teclado.lerInt("Informe o valor do 1� termo.");
		r = Teclado.lerInt("Informe o valor da raz�o.");
		termo5 = (t * r) * r * r * r ;
	
		System.out.println("O valor do 5� termo �: " + termo5);
		
		
	}

}