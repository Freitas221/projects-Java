package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuintes;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Contribuintes> List = new ArrayList<>();

		System.out.print("Digite o numero de contribuintes: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.print("O contribuinte é pessoa fisica ou juridica f/j: ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.printf("Nome: ");
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();

			if (ch == 'f') {
				System.out.print("Gastos com saúde: ");
				double gastosSaude = sc.nextDouble();
				List.add(new PessoaFisica(name, rendaAnual, gastosSaude));

			} else {
				System.out.print("Numero de funcionários: ");
				int funcionarios = sc.nextInt();
				List.add(new PessoaJuridica(name, rendaAnual, funcionarios));
			}
		}
		
		for (Contribuintes acc : List) {
			System.out.println("Name: " + acc.getName() + " " + "$ " + String.format("%.2f", acc.imposto()));
		}

		sc.close();

	}

}
