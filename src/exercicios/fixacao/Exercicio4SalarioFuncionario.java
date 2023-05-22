package exercicios.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4SalarioFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner leia = new Scanner (System.in);
		
		int numFunci;
		double horasTrab, valor;
		String nome;
		double salario = 0;
		
		System.out.println("SALARIO DOS FUNCIONARIOS!");
		
		System.out.println("Digite o nome do funcionario: ");
		nome = leia.nextLine();
		
		System.out.println("Digite a matricula do funcionário: ");
		numFunci = leia.nextInt();
		
		System.out.println("Digite o numero de horas trabalhadas: ");
		horasTrab = leia.nextDouble();
		
		System.out.println("Digite o valor da hora trabalhada: ");
		valor = leia.nextDouble();
		
		salario = horasTrab * valor;
		
		System.out.println("Funcionário e matricula: " + nome + " - Matrícula: " + numFunci);
		System.out.printf("Salário: U$ %.2f", salario);

	}

}
