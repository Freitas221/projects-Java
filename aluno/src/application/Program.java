package application;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("Quantos alunos cursam o curso a: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			int alunoA = sc.nextInt();
			a.add(alunoA);
		}
		
		System.out.print("Quantos alunos cursam o curso b: ");
		int x = sc.nextInt();
		for(int i = 0; i < x; i++) {
			int alunoB = sc.nextInt();
			b.add(alunoB);
		}
		
		System.out.print("Quantos alunos cursam o curso c: ");
		int y = sc.nextInt();
		for(int i = 0; i < y; i++) {
			int alunoC = sc.nextInt();
			c.add(alunoC);
		}
		
		Set<Integer> total = new HashSet<>(a);
		a.addAll(b);
		a.addAll(c);
		
		System.out.println("Total de alunos: "+ total.size());
		
		sc.close();
	}

}
