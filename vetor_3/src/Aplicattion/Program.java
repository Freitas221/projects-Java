package Aplicattion;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Produto;



public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Produto[] vect = new Produto[n];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			int idade = sc.nextInt();
			double altura = sc.nextDouble();

			vect[i] = new Produto(name, idade, altura);
		}
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da pessoa " + (i + 1) + ": \n " + vect[i].toString());

		}
		double soma = 0;
		for (int i = 0; i < n; i++) {
			soma += vect[i].getAltura();
		}
		double media = soma / n;
		System.out.printf("A media das alturas são: %.2f \n", media);

		int totIdade = 0;
		for (int i = 0; i < n; i++) {
			if (vect[i].getIdade() < 16) {
				totIdade++;
			}
		}
		double percent = totIdade * 100.0 / n;
		System.out.printf("Pessoas com menos de 16 anos: %.1f%% \n", percent);
		
		for (int i = 0; i < n; i++) {
			if(vect[i].getIdade() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		sc.close();
	}

}
