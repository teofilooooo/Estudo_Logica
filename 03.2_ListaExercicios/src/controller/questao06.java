package controller;

import util.Teclado;

public class questao06 {

	public static void main(String[] args) {
		
		String nomeVende;
		double salFixo, totalVenda;
				
		nomeVende = Teclado.lerTexto("Informe seu nome.");
		salFixo = Teclado.lerDouble("Infome seu sal�rio base.");
		totalVenda = Teclado.lerDouble("Informe o valor de suas vendas neste m�s.");
		
		System.out.println(nomeVende+", seu sal�rio base �: R$"+salFixo+" e sua comiss�o foi R$"+(totalVenda*15)/100);
		System.out.println("O valor total do seu sal�rio este m�s � R$"+ ((totalVenda*15)/100 +salFixo));
	
		
	}

}