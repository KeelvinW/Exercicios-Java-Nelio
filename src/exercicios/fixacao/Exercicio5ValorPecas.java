package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5ValorPecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner (System.in);
		
		int codigo1, numero1, codigo2, numero2;
		
		double valor1, valor2, tot1, tot2;
		
		double total = 0;
		
		System.out.println("VALOR TOTAL PARA PAGAR NAS PEÇAS");
		System.out.println("Código peça 1: ");
		codigo1 = leia.nextInt();
		
		System.out.println("Quantidade de peças: ");
		numero1 = leia.nextInt();
		
		System.out.println("Valor da unidade: ");
		valor1 = leia.nextDouble();
		
		tot1 = numero1 * valor1;
		
		System.out.println("Código peça 2: ");
		codigo2 = leia.nextInt();
		
		System.out.println("Quantidade de peças: ");
		numero2 = leia.nextInt();
		
		System.out.println("Valor da unidade: ");
		valor2 = leia.nextDouble();
		
		tot2 = numero2 * valor2;
		
		total = tot1 + tot2;
		
		System.out.printf("Valor a pagar: R$ %.2f", total);
	}

}
