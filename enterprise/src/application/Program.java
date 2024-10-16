package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Entre com o caminho do arquivo: ");
		String path = sc.nextLine();
		
		System.out.print("Digite um salário: ");
		Double salary = sc.nextDouble();
		
		try(BufferedReader br = new BufferedReader((new FileReader(path)))){
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] vect = line.split(",");
				list.add(new Employee(vect[0], vect[1], Double.parseDouble(vect[2])));
				
				line = br.readLine();
			}
			
			List<String> emails = list.stream().filter(f -> f.getSalary() > salary).map(p -> p.getEmail()).sorted().collect(Collectors.toList());
			
			Double sum = list.stream().filter(f -> f.getName().charAt(0) == 'M').map(x -> x.getSalary()).reduce(0.0, (x, y) -> x + y );
			
			System.out.println();
			System.out.println("E-mail de pessoas cujo salário é superior a " + String.format("%.2f", salary) + ":");
			emails.forEach(System.out::println);
			
			System.out.println();
			System.out.println("Soma dos salários das pessoas cujo nome começa com 'M': " + String.format("%.2f", sum));
	
			
		}catch(IOException e) {
			System.out.println("Error" + e);
		}
		
		
		sc.close();
	}

}
