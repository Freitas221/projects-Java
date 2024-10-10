package Application;

import java.util.Locale;
import java.util.Scanner;

import Entities.Salary;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Salary salary = new Salary();
		

		
		System.out.printf("Name: ");
		salary.name = sc.nextLine();
		System.out.println();
		
		System.out.printf("Salário Bruto: ");
		salary.salarioBruto = sc.nextDouble();
		
		
	    System.out.println();
	    System.out.println("Imposto: ");
	    salary.impost = sc.nextDouble();
	    System.out.println();
	    System.out.println("Nome: "+ salary);
	    
	    
	    System.out.println();
	    System.out.println("Qual percentual deseja aumentar o salário? ");
	    double percent = sc.nextDouble();
	    salary.increaseSalary(percent);
	    
	    System.out.println();
	    System.out.println("Nome: "+salary);
		
		
		sc.close();
		
		
	}

}
