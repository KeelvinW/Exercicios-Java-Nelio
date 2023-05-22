package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio6CalculosArea {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		
		double A, B, C;
		double pi = 3.14159;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		System.out.println("Digite o primeiro valor: ");
		A = leia.nextDouble();
		System.out.println("Digite o segundo valor: ");
		B = leia.nextDouble();
		System.out.println("Digite o terceiro valor: ");
		C = leia.nextDouble();
		
		triangulo = A * B / 2;
		circulo = pi * (Math.pow(C, 2));
		trapezio = ((A + B) * C) / 2;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f %n", triangulo);
		System.out.printf("CIRCULO: %.3f %n", circulo);
		System.out.printf("TRAPEZIO: %.3f %n", trapezio);
		System.out.printf("QUADRADO: %.3f %n", quadrado);
		System.out.printf("RETÂNGULO: %.3f %n", retangulo);
		
	}

}
