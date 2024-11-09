package Aplication;

import java.util.Locale;
import java.util.Scanner;
import Entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.printf("Digite a 1° nota do aluno: ");
		aluno.trimestre1 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Digite a  2° nota do aluno: ");
		aluno.trimestre2 = sc.nextDouble();
		
		System.out.println();
		
		System.out.printf("Digite a 3° nota do aluno: ");
		aluno.trimestre3 = sc.nextDouble();
		aluno.somaTrimestre();

		System.out.println();
		aluno.resultadoFinal();
		
		
		sc.close();
	}

}
