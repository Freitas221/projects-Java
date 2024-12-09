package apllication;

import java.util.Locale;
import java.util.Scanner;

import Entidades.Program;

public class Progra {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int n  = sc.nextInt();
		Program[] vect = new Program[n];
		
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vect[i]  = new Program(name, price);
			
		}
		double soma = 0.0;
		for(int i = 0; i < n; i++) {
			soma = vect[i].getPrice();
		}
		double media = soma / n;
		System.out.printf("A média dos valores são: %.2f", media);
		
		sc.close();
	}

}
