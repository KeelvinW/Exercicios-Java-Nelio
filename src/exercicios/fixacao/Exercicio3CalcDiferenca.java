package exercicios.fixacao;

import java.util.Scanner;

public class Exercicio3CalcDiferenca {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int A, B, C, D;
		int dif = 0;
		
		System.out.println("DIFERENÇA DO PRODUTO DE QUATRO NÚMEROS INTEIROS");
		
		System.out.println("Digite o primeiro numero: ");
		A = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		B = leia.nextInt();
		
		System.out.println("Digite o terceiro numero: ");
		C = leia.nextInt();
		
		System.out.println("Digite o quarto numero: ");
		D = leia.nextInt();
		
		dif = (A * B) - (C * D);
		
		System.out.println("Diferença = " + dif);
	}

}
