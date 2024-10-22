package curso_java;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		int value = 20;
		double x = 10.35189;
		System.out.println("Teste");

		System.out.println(value);
		System.out.printf("%.2f\n", x);

		Locale.setDefault(Locale.US);

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
