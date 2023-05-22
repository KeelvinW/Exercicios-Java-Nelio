package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2RaioCirculo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner (System.in);
		
		//Declarar as variaveis, uma com o valor de PI, uma para receber o raio e outra para receber a lógica da área.
		double pi = 3.14159;
		double raio = 0;
		double area = 0;
		
		//Armazene o valor digitado.
		System.out.println("AREA DE UM CIRCULO UTILIZANDO O RAIO!");
		System.out.println("Digite o valor do raio de um circulo: ");
		raio = leia.nextDouble();
		
		//Faça a lógica para calcular a area de um circulo.
		area = pi * (Math.pow(raio, 2));
		
		//Mostre o valor na tela.
		System.out.printf("Área do circulo = %.4f", area);
	}

}
