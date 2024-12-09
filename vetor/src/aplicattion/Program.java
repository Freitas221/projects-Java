package aplicattion;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			vect[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			System.out.println(vect[i]);
			soma += vect[i];
		}

		double media = soma / n;
		System.out.println("Media: " +media);
		System.out.println("SOMA: " +soma);
		
		sc.close();
	}

}
