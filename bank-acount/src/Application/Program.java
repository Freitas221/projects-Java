package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exception.LimitException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		try {
			System.out.println("Entre com os dados da conta");
			System.out.println();
			
			System.out.print("Numero da conta: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Nome da conta: ");
			String name = sc.nextLine();
			System.out.print("Digite o saldo inicial da conta: ");
			double saldo = sc.nextDouble();
			System.out.print("Digite o limite de saque: ");
			double saldoLimite = sc.nextDouble();
			
			Account acc = new Account(number, name, saldo, saldoLimite);
			
			System.out.println();
			System.out.print("Entre com o valor que deseja sacar: ");
			double quantia = sc.nextDouble();
			
			acc.saque(quantia);
			System.out.print("Novo saldo: "+ acc.getSaldo());
		}
		catch(LimitException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de imput");
		}
		
		sc.close();
	}

}
