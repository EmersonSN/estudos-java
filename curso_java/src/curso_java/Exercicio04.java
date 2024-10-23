package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorhora, salario;
		int id, qtdHoras;
		
		id = sc.nextInt();
		qtdHoras = sc.nextInt();
		valorhora = sc.nextDouble();
		salario = qtdHoras * valorhora;
		
		System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", id, salario);
		
		sc.close();
	}

}
