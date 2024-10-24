package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDedados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);// Para usar . em double na entrada de dados
		Scanner sc = new Scanner(System.in);
		String x, s1, s2, s3;
		int y;
		double z;
		char a;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);

		System.out.println("Palavra digitada: " + x);
		System.out.println("Número digitado: " + y);
		System.out.println("Número digitado: " + z);
		System.out.println("Letra digitada: " + a);

		System.out.println("============");

		y = sc.nextInt();
		sc.nextLine();//consumindo a quebra de linha pendente
		s1 = sc.nextLine();//Ler até a quebra de linha
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("Dados digitados:");
		System.out.println(y);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
