package Application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import model.entities.Listagem;
import model.enums.Genero;
import model.exception.DomainExcepetion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter sdf =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Listagem> list = new ArrayList<>();

		System.out.println("BEM VINDO AS SISTEMA DE SAÚDE");
		System.out.println();

		try {
			
			System.out.print("Quantos pacientes deseja alocar no sistema: ");
			int x = sc.nextInt();
			sc.nextLine();
			
			for (int i = 0; i < x; i++) {
				
				System.out.println();
				System.out.print("Nome do paciente: ");
				String name = sc.nextLine();
				System.out.print("Data de entrada no hospital: ");
				LocalDate date = LocalDate.parse(sc.nextLine(), sdf);
				System.out.print("Idade do paciente: ");
				int idade = sc.nextInt();
				sc.nextLine();
				System.out.print("Sexo do paciente - (M)ou(F): ");
				Genero genero = Genero.valueOf(sc.next());
				sc.nextLine();
				System.out.print("Data atual: ");
				LocalDate atualDate = LocalDate.parse(sc.nextLine(), sdf);

				list.add(new Listagem(name, date, idade, genero, atualDate));

			}
			
			for(Listagem lista : list) {
				System.out.println(lista);
			}

		}
		catch (DomainExcepetion e) {
			System.out.println();
			System.out.println(e.getMessage());
		} 
		catch (InputMismatchException e) {
			System.out.println();
			System.out.println("Erro de input");
		}
		catch(IllegalArgumentException e){
			System.out.println();
			System.out.println("As letras precisam estar em MAIÚSCULAS");
		}
		catch(DateTimeParseException e) {
			System.out.println();
			System.out.println("A data precisa ser inserida no formato: dd/MM/yyyy");
		}
		sc.close();
	}

}
