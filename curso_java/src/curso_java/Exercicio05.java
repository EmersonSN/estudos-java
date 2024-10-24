package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id1, qtd1, id2, qtd2;
		double valor1, total1, valor2;

		id1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		id2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();

		total1 = qtd1 * valor1 + qtd2 * valor2;

		System.out.printf("VALOR A PAGAR: R$ %.2f", total1);
		
		sc.close();
	}

}
