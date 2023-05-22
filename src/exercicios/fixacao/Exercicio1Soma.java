package exercicios.fixacao;

import java.util.Scanner;

public class Exercicio1Soma {

	public static void main(String[] args) {
		
		//Primeiro importar a classe Scanner para entrada de dados.
		Scanner leia = new Scanner (System.in);
		
		//Declarar duas variáveis do tipo inteiro para receber os valores digitados e uma para armazenar a soma dos valores.
		int valor1 = 0;
		int valor2 = 0;
		int totSoma = 0;
		
		//Receber as informações serão digitados.
		System.out.println("SOMA ENTRE DOIS NÚMEROS INTEIROS!");
		
		System.out.println("Digite o primeiro número inteiro: ");
		valor1 = leia.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		valor2 = leia.nextInt();
		
		//Fazer a lógica para somar os dois valores.
		totSoma = valor1 + valor2;
		
		//Mostrar os dois valores na tela.
		System.out.println("Soma = " + totSoma);
	}

}
