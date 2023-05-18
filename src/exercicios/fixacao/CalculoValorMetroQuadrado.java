package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class CalculoValorMetroQuadrado {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double larg = 0;
		double comp = 0;
		double area = 0;
		double preco = 0;
		int cidade = 0;
		
		Locale.setDefault(Locale.US);
		System.out.println("CALCULE O VALOR DO M² EM TODOS OS TERRENOS DA SUA REGIÃO!");
		
		System.out.println("Digite a largura do terreno: ");
		larg = leia.nextDouble();
		
		System.out.println("Digite o comprimento: ");
		comp = leia.nextDouble();
		
		System.out.println("Escolha a cidade: ");
		System.out.println("1 - Brasília");
		System.out.println("2 - Rio de Janeiro");
		System.out.println("3 - Florianópolis");
		System.out.println("4 - Salvador");
		System.out.println("5 - São Paulo");
		cidade = leia.nextInt();
		
		System.out.printf("largura: %.2f x altura: %.2f %n", larg , comp);
		
		area = larg * comp;
		
			switch (cidade) {
				case 1 -> {
					preco = area * 9098;
					System.out.printf("Na cidade de Brasília a area total de %.3fM² tem o valor total de R$ %.2f", area, preco);
				}
				case 2 -> {
					preco = area * 8158;
					System.out.printf("Na cidade de Rio de Janeiro a area total de %.3fM² tem o valor total de R$ %.2f", area, preco);
				}
				case 3 -> {
					preco = area * 4022;
					System.out.printf("Na cidade de Florianópolis a area total de %.3fM² tem o valor total de R$ %.2f", area, preco);
				}
				case 4 -> {
					preco = area * 4277;
					System.out.printf("Na cidade de Salvador a area total de %.3fM² tem o valor total de R$ %.2f", area, preco);
				}
				case 5 -> {
					preco = area * 9302;
					System.out.printf("Na cidade de São Paulo a area total de %.3fM² tem o valor total de R$ %.2f", area, preco);
				}
			}
		
		
		
		leia.close();
	}

}
