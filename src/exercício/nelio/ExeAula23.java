package exercício.nelio;

import java.util.Locale;
import java.util.Scanner;

public class ExeAula23 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		/*String prod1 = "Computer";
		String prod2 = "Office desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products:");
		System.out.printf("%s, which price is $ %.2f %n", prod1, price1);
		System.out.printf("%s, which price is $ %.2f %n", prod2, price2);
		
		System.out.printf("Record: %d years old, code %d and gender: %s %n", age, code, gender);
		
		System.out.println("measue with eight decimal places: " + measure);
		System.out.printf("Rouded (three decimal places): %.3f %n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f ", measure);*/
		
		double delta = 0;
		double a = 0;
		double b = 0;
		double c = 0;
		
		double x1 = 0;
		double x2 = 0;
		
		System.out.println("Resolvendo bascara!");
		System.out.println("digite o valor de A: ");
		a = leia.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = leia.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = leia.nextDouble();
		
		delta = Math.pow(b, 2.0) - 4 * a * c;
		
		System.out.println("Valor de Delta: " + delta);
		
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
		x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
		
		System.out.println("Valor bastacar positivo: " + x1);
		System.out.println("Valor bastacar negativo: " + x2);

	}

}
